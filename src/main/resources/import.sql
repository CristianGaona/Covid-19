insert into `countries` (iso_code,name_country,dsp_per_capita, hospital_beds_per) values('AUT','Austria',45436686,7.37);
insert into `countries` (iso_code,name_country,dsp_per_capita, hospital_beds_per) values('DEU','Germany',45229245,8);
insert into `countries`  (iso_code,name_country,dsp_per_capita, hospital_beds_per) values('FRA','France',38605671,5.98);
insert into `countries`  (iso_code,name_country,dsp_per_capita, hospital_beds_per) values('IRL','Ireland',67335293,2.96);
insert into `countries` (iso_code,name_country,dsp_per_capita, hospital_beds_per) values('ITA','Italy',35220084,3.18);
insert into `countries`  (iso_code,name_country,dsp_per_capita, hospital_beds_per) values('LTU','Lithuania',29524265,6.56);
insert into `countries`  (iso_code,name_country,dsp_per_capita, hospital_beds_per) values('PRT','Portugal',27936896,3.39);

insert into `report_cases`  (date_report,new_cases,total_case) values('2019/12/01',1,1);
insert into `report_cases`  (date_report,new_cases,total_case) values('2019/12/02,1,1);
insert into `report_cases`  (date_report,new_cases,total_case) values('2019/12/03',1,1);

insert into `countries_reports`(id_country, id_report_case) Values (1,1), (1,3),(1,2);
