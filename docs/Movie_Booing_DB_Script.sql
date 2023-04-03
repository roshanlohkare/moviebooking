CREATE TABLE "Ticket" (
  "id" integer PRIMARY KEY,
  "movie_id" integer,
  "customer_id" integr,
  "theater_id" integer,
  "auditorium_id" integer,
  "seat_id" integer,
  "showtime_id" integer,
  "offer_id" integer,
  "price" number
);

CREATE TABLE "Customer" (
  "id" integer PRIMARY KEY,
  "firstName" varchar,
  "lastName" varchar,
  "gender" varchar,
  "birthDate" timestamp,
  "address_id" integer,
  "contact_id" integer,
  "preference_id" integer,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "Theater" (
  "id" integer PRIMARY KEY,
  "name" varchar,
  "address_id" integer,
  "auditorium_id" integer,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "Auditorium" (
  "id" integer PRIMARY KEY,
  "name" varchar,
  "theater_id" integer,
  "movie_id" integer,
  "showtime_id" integer,
  "seat_id" integer,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "Seat" (
  "id" integer PRIMARY KEY,
  "rowNum" varchar,
  "seatNum" varchar,
  "available" varchar,
  "auditorium_id" integer,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "ShowTime" (
  "id" integer PRIMARY KEY,
  "date" timestamp,
  "startTime" timestamp,
  "endTime" timestamp,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "Contact" (
  "id" integer PRIMARY KEY,
  "emailId" varchar,
  "phoneNumber" varchar,
  "faxAddress" varchar,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "Address" (
  "id" integer PRIMARY KEY,
  "address1" varchar,
  "address2" varchar,
  "address3" varchar,
  "city_id" integer,
  "state_id" integer,
  "country_id" integer,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "Country" (
  "id" integer PRIMARY KEY,
  "name" varchar,
  "countryCode" varchar,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "State" (
  "id" integer PRIMARY KEY,
  "name" varchar,
  "stateCode" varchar,
  "country_id" integer,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "City" (
  "id" integer PRIMARY KEY,
  "name" varchar,
  "cityCode" varchar,
  "state_id" integer,
  "country_id" integer,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "Movie" (
  "id" integer PRIMARY KEY,
  "name" varchar,
  "language" varchar,
  "genre" varchar,
  "created_at" timestamp,
  "created_by" varchar,
  "modified_at" timestamp,
  "modified_by" varchar
);

CREATE TABLE "Offer" (
  "id" integer PRIMARY KEY,
  "name" varchar,
  "discount" integer
);

ALTER TABLE "Country" ADD FOREIGN KEY ("id") REFERENCES "City" ("country_id");

ALTER TABLE "State" ADD FOREIGN KEY ("id") REFERENCES "City" ("state_id");

ALTER TABLE "Country" ADD FOREIGN KEY ("id") REFERENCES "State" ("country_id");

ALTER TABLE "City" ADD FOREIGN KEY ("id") REFERENCES "Address" ("city_id");

ALTER TABLE "State" ADD FOREIGN KEY ("id") REFERENCES "Address" ("state_id");

ALTER TABLE "Country" ADD FOREIGN KEY ("id") REFERENCES "Address" ("country_id");

ALTER TABLE "Address" ADD FOREIGN KEY ("id") REFERENCES "Customer" ("address_id");

ALTER TABLE "Contact" ADD FOREIGN KEY ("id") REFERENCES "Customer" ("contact_id");

ALTER TABLE "Auditorium" ADD FOREIGN KEY ("theater_id") REFERENCES "Theater" ("id");

ALTER TABLE "Seat" ADD FOREIGN KEY ("id") REFERENCES "Auditorium" ("seat_id");

ALTER TABLE "ShowTime" ADD FOREIGN KEY ("id") REFERENCES "Auditorium" ("showtime_id");

ALTER TABLE "Movie" ADD FOREIGN KEY ("id") REFERENCES "Auditorium" ("movie_id");

ALTER TABLE "Movie" ADD FOREIGN KEY ("id") REFERENCES "Ticket" ("movie_id");

ALTER TABLE "Customer" ADD FOREIGN KEY ("id") REFERENCES "Ticket" ("customer_id");

ALTER TABLE "Theater" ADD FOREIGN KEY ("id") REFERENCES "Ticket" ("theater_id");

ALTER TABLE "Auditorium" ADD FOREIGN KEY ("id") REFERENCES "Ticket" ("auditorium_id");

ALTER TABLE "Seat" ADD FOREIGN KEY ("id") REFERENCES "Ticket" ("seat_id");

ALTER TABLE "ShowTime" ADD FOREIGN KEY ("id") REFERENCES "Ticket" ("showtime_id");

ALTER TABLE "Offer" ADD FOREIGN KEY ("id") REFERENCES "Ticket" ("offer_id");
