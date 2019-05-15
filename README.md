# Distributed Lab
This project is submitted for lab assignment on RMI.

# The Project Concept!
Its sample project on how a hospital payment system works.The system will continue 4 sub system.
  - The First system will be the point of sales. The system will be allow to register new patients and the data will be replicated and stored on the other 3 systems. After the transactions are made the system will calculate all the vouchers from each transactions and will show the print out.
  - The second system will the practitioner and hospital subsystem which includes cost of the cards and other practitioner cost. It will store its own voucher 
        Database – Patient information, Service List, Vouchers
  - The third system will be Laboratory subsystem. The laboratory test will be registered and it will store its own voucher also
DB – Patient information, Laboratory tests, Vouchers
  - The fourth system about pharmacy. And it will stores medicine and vouchers will made with it too. 
DB – Patient information, Medicine , Vouchers

### Step on how to run the application
Assumption all reqired netbeans dependencies are installed.
```sql
<!--For Hospital POS Service...-->
CREATE DATABASE `hospitalpos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `patientinformation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
For labratory service...
```sql
<!--Create database for labratory service-->
CREATE DATABASE `labratory` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `patientinformation` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `services` (
  `idservices` int(11) NOT NULL,
  `serviceName` varchar(45) NOT NULL,
  `serviceType` varchar(45) DEFAULT NULL,
  `servicePrice` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`idservices`),
  UNIQUE KEY `serviceName_UNIQUE` (`serviceName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `voucher` (
  `idvoucher` int(11) NOT NULL AUTO_INCREMENT,
  `patientId` int(11) DEFAULT NULL,
  `item` varchar(45) DEFAULT NULL,
  `itemCount` varchar(45) DEFAULT NULL,
  `itemPrice` varchar(45) DEFAULT NULL,
  `isActive` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idvoucher`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
For hospitalservice service...
```sql
CREATE DATABASE `hospitalservice` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `patientinformation` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `services` (
  `idservices` int(11) NOT NULL,
  `serviceName` varchar(45) NOT NULL,
  `serviceType` varchar(45) DEFAULT NULL,
  `servicePrice` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`idservices`),
  UNIQUE KEY `serviceName_UNIQUE` (`serviceName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `voucher` (
  `idvoucher` int(11) NOT NULL AUTO_INCREMENT,
  `patientId` int(11) DEFAULT NULL,
  `item` varchar(45) DEFAULT NULL,
  `itemCount` varchar(45) DEFAULT NULL,
  `itemPrice` varchar(45) DEFAULT NULL,
  `isActive` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idvoucher`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
For pharmacy service...
```sql
CREATE DATABASE `pharmacy` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `patientinformation` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `services` (
  `idservices` int(11) NOT NULL,
  `serviceName` varchar(45) NOT NULL,
  `serviceType` varchar(45) DEFAULT NULL,
  `servicePrice` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`idservices`),
  UNIQUE KEY `serviceName_UNIQUE` (`serviceName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `voucher` (
  `idvoucher` int(11) NOT NULL AUTO_INCREMENT,
  `patientId` int(11) DEFAULT NULL,
  `item` varchar(45) DEFAULT NULL,
  `itemCount` varchar(45) DEFAULT NULL,
  `itemPrice` varchar(45) DEFAULT NULL,
  `isActive` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idvoucher`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

```