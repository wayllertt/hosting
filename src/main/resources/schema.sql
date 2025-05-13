--CREATE TABLE IF NOT EXISTS users (
--    id BIGINT PRIMARY KEY,
--    name VARCHAR(100) NOT NULL,
--    email VARCHAR(255) NOT NULL UNIQUE,
--    password VARCHAR(255) NOT NULL
--    username VARCHAR(100) NOT NULL UNIQUE,
--);

CREATE TABLE IF NOT EXISTS videos (
  id          BIGSERIAL    PRIMARY KEY,
  title       VARCHAR(100) NOT NULL,
  url         TEXT         NOT NULL UNIQUE,
  description TEXT         NOT NULL,
  cast        VARCHAR(500),
  director    VARCHAR(255),
  rating      NUMERIC(3,1),
  created_at  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);