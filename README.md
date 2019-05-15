# Distributed Lab (Payment System for Electronic Medical Record )
EMR stands for Electronic medical records, which are the digital equivalent of paper records, or charts at a clinician’s office. EMRs typically contain general information such as treatment and medical history about a patient as it is collected by the individual medical practice.
Our system will provide one point payment location for such system. The payment will be calculated from three different service. These are.
1. The practitioner and hospital cost. 
2. The Laboratory cost. 
3. Pharmacy cost. 
The end user/customer will able to pay from a single position for all his medical cost. All the service can be of different company but they will be able to pay for all of this using centralized manner.1. The practitioner and hospital cost. 
2. The Laboratory cost. 
3. Pharmacy cost. 
The end user/customer will able to pay from a single position for all his medical cost. All the service can be of different company but they will be able to pay for all of this using centralized manner.

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
Assumption all Netbeans is installed and working properly. And mysql connector is added to each projects. 
```sh 
 # database connection string
 username: root
 password: 123456
```
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



### Insert Dummy Data
```sql
INSERT INTO `hospitalservice`.`services`
(`idservices`,
`serviceName`,
`serviceType`,
`servicePrice`)
VALUES
(1,
'Card',
null,
50);
INSERT INTO `hospitalservice`.`services`
(`idservices`,
`serviceName`,
`serviceType`,
`servicePrice`)
VALUES
(2,
'Doctor Checkup',
null,
1000);
INSERT INTO `pharmacy`.`services`
(`idservices`,
`serviceName`,
`serviceType`,
`servicePrice`)
VALUES
(1,
'Amoxcacilin',
null,
10);
INSERT INTO `pharmacy`.`services`
(`idservices`,
`serviceName`,
`serviceType`,
`servicePrice`)
VALUES
(2,
'Advil',
null,
80);
INSERT INTO labratory.services
(`idservices`,
`serviceName`,
`serviceType`,
`servicePrice`)
VALUES
(1,
'Blood Testing',
null,
25);
INSERT INTO labratory.services
(`idservices`,
`serviceName`,
`serviceType`,
`servicePrice`)
VALUES
(2,
'Urine Testing',
null,
60);

```
## Group Members
| Full Name |
| --------- |
| Eyoel  |
| Girma  |
| Lelise |
| Tinsae |
| Yonas  |

