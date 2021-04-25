DROP TABLE IF EXISTS t_user_profile;
DROP TABLE IF EXISTS t_user;
DROP TABLE IF EXISTS t_prescription;
DROP TABLE IF EXISTS t_med_time;


CREATE TABLE t_user_profile (
id INT NOT NULL PRIMARY KEY,
name INT NOT NULL,
active BOOLEAN NOT NULL,
entry_ts TIMESTAMP NOT NULL);

CREATE TABLE t_user (
id INT NOT NULL PRIMARY KEY,
user_id INT NOT NULL,
login_name VARCHAR(50) NOT NULL,
login_password VARCHAR(50) NOT NULL,
entry_ts TIMESTAMP NOT NULL);

CREATE TABLE t_prescription (
user_id INT NOT NULL,
name VARCHAR(250) NOT NULL,
note VARCHAR(500) NOT NULL,
entry_ts TIMESTAMP NOT NULL,
id INT NOT NULL PRIMARY KEY,
active BOOLEAN NOT NULL);

CREATE TABLE t_med_time (
id INT NOT NULL,
user_id INT NOT NULL,
medication_id INT NOT NULL,
time TIME NOT NULL,
PRIMARY KEY (id,user_id,medication_id));

ALTER TABLE t_user ADD CONSTRAINT user_user_id_user_profile_id FOREIGN KEY (user_id) REFERENCES t_user_profile(id);
ALTER TABLE t_prescription ADD CONSTRAINT prescription_user_id_user_profile_id FOREIGN KEY (user_id) REFERENCES t_user_profile(id);
ALTER TABLE t_med_time ADD CONSTRAINT med_time_user_id_user_profile_id FOREIGN KEY (user_id) REFERENCES t_user_profile(id);
ALTER TABLE t_med_time ADD CONSTRAINT med_time_medication_id_prescription_id FOREIGN KEY (medication_id) REFERENCES t_prescription(id);
