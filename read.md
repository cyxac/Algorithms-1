Renewal Service 
===========
This project works as notification system for reminding subscribers 30 days before the expiration of their products. For front end UI AngularJS and JQuery are used and Grails and MongoDB are used in back end. 

Warning
---------
Because this project has completed function for email sending out. Double-check before any launch.
- renewal-mailer/grails-app/services/ProductRenewalService.groovy  method: sendSES()
- renewal-mailer/grails-app/conf/Config.groovy set renewal.recipient.overrideEmailAaddress and renewal.source.overrideEmailAddress

Main UI
---------
1. Initiate project: THESE URLs ARE FOR DEVELOPERS ONLY
In local/stage test, to send out a large number of real emails to test is not realistic, to test the functions in this project initiate methods will generate a bunch of fake data.

(1). http://localhost:8080/init/productInit
- create all products and sample template for each product, save to mongoDB, you can see results in product page if success.

(2). http://localhost:8080/init/productDrop
- delete all products and their templates, be careful...

(3). http://localhost:8080/init/templateDrop
- delete all templates, be careful...

(4). http://localhost:8080/init/emailInitByDay
- randomly generate fate email records for each product for the last 15 days. 

(5). http://localhost:8080/init/emailDropByDay
- delete all emails, very careful about this, never use it in production.


API usage (please refer to "renewal-mailer/grails-app/conf/UrlMappings")
---------
1.product APIs

http://renewals.dc.thestreet.com/api/products
http://renewals.dc.thestreet.com/api/products/54dd05a0e4b0314da99b8916  (with id)

2.template APIs

http://renewals.dc.thestreet.com/api/templates
http://renewals.dc.thestreet.com/api/templates/54dd05a0e4b0314da99b8917

3.stats APIs

(1). http://renewals.dc.thestreet.com/api/stats/getProductCodes
- get all active products name and code pairs

(2). http://renewals.dc.thestreet.com/api/stats/getAllProductCodes
- get all products name and code pairs

(3). http://renewals.dc.thestreet.com/api/stats/getStatsByDate?product=SB-9&start=02112015&end=02132015
- product cannot be null, must be at least one product code
- start and end are both optional, format is MMDDYYYY, if start is null, choose 10 days before end, if end is null, choose 10 days after start, if both are null, choose most recent 10 days.
- IMPORTANT: http://renewals.dc.thestreet.com/api/stats/getStatsByDate2?product=SB-9&start=02112015&end=02132015, the only difference is return JSON will product code as key.


(4). http://renewals.dc.thestreet.com/api/stats/getMailingDetails?productName=TheStreet.com%20Options%20Profits&productScope=Sent&productDate=2015/02/09
- productName cannot be null.
- productScope can be "Sent" or other work or null, only "Sent" represents successful sent emails
- productDate is formated as YYYY/MM/DD

(5). http://localhost:8080/api/stats/searchEmails?terms=mike&productCode=%20All&startIndex=0&itemsPerPage=10
- simple search to get email details back
- terms are the key words, example: mike%20gorback -> search both results contains both mike and gorback
- product Code is not necessary, will search all if code is null
- startIndex and itemsPerPage are optional


4.notices APIs

http://renewals.dc.thestreet.com/api/notices/findNotice?noticeId=54d8e46d8786c01175a004de


Test Trigger, DO NOT USE UNLESS YOU ARE A DEVELOPER
---------
- renewal-mailer/grails-app/controllers/com.thestreet.commerce/TestController
access url:/test/method_name, example: /test/test3

(1). test1 will work for sending out email to one test product ("SB-65")

(2). test2 will update the email status from AWS SQS

(3). test3 will only send one simple test email to developer

(4). test4 will trigger reporting notification

(5). test5 will generate a report

(6). test6 will find out infomation from AWS SQS


Local/Development Environment
---------


Stage/Prod Environment
---------
stage url: stagerenewal.dc.thestreet.com
production url: renewals.dc.thestreet.com
