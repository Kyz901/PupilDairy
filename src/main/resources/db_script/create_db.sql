CREATE TABLE marks (
  id int unsigned NOT NULL AUTO_INCREMENT,
  id_of_lesson int unsigned DEFAULT NULL,
  id_of_pupil int unsigned DEFAULT NULL,
  mark int unsigned DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_of_lesson) REFERENCES lessons (id)
			ON DELETE RESTRICT
			ON UPDATE CASCADE,
  FOREIGN KEY (id_of_pupil) REFERENCES pupils (id)
			ON DELETE RESTRICT
			ON UPDATE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

CREATE TABLE pupils (
  id int unsigned NOT NULL AUTO_INCREMENT,
  first_name varchar(40) DEFAULT NULL,
  last_name varchar(40) DEFAULT NULL,
  father_name varchar(40) DEFAULT NULL,
  birthday date DEFAULT NULL,
  id_of_class int unsigned DEFAULT NULL,
  start_year_education date DEFAULT NULL,
  isDeleted enum('true','false') NOT NULL DEFAULT 'false',
  isGraduated enum('true','false') NOT NULL DEFAULT 'false',
  PRIMARY KEY (id),
  FOREIGN KEY (id_of_class) REFERENCES school_classes (id)
			ON DELETE RESTRICT
			ON UPDATE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = utf8;


CREATE TABLE school_classes (
  id int unsigned NOT NULL AUTO_INCREMENT,
  name_of_class varchar(5) DEFAULT NULL,
  id_class_teacher int unsigned DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_class_teacher) REFERENCES teachers (id)
			ON DELETE RESTRICT
			ON UPDATE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = utf8;


CREATE TABLE teachers (
  id int unsigned NOT NULL AUTO_INCREMENT,
  first_name varchar(40) DEFAULT NULL,
  last_name varchar(40) DEFAULT NULL,
  father_name varchar(40) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;



CREATE TABLE lessons (
  id int unsigned NOT NULL AUTO_INCREMENT,
  name_of_lesson varchar(255) DEFAULT NULL,
  id_teacher int unsigned DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_teacher) REFERENCES teachers (id)
			ON DELETE RESTRICT
			ON UPDATE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = utf8;