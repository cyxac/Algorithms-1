Renewal Service 
===========
This project works as notification system for reminding subscribers 30 days before the expiration of their products. For front end UI AngularJS and JQuery are used and Grails and MongoDB are used in back end. 

Warning
---------
Because this project has completed function for email sending out. Double-check before any launch.
- renewal-mailer/grails-app/services/ProductRenewalService.groovy  method: sendSES()
- renewal-mailer/grails-app/conf/Config.groovy set renewal.recipient.overrideEmailAaddress and renewal.source.overrideEmailAddress
- 

Main UI
---------
1. Initiate project: THESE URLs ARE FOR DEVELOPERS ONLY
In local/stage test, to send out a large number of real emails to test is not realistic, to test the functions in this project initiate methods will generate a bunch of fake data.

http://localhost:8080/init/productInit
- create all products and sample template for each product, save to mongoDB, you can see results in product page if success.
http://localhost:8080/init/productDrop
- delete all products and their templates, be careful...
http://localhost:8080/init/templateDrop
- delete all templates, be careful...
http://localhost:8080/init/emailInitByDay
- randomly generate fate email records for each product for the last 15 days. 
http://localhost:8080/init/emailDropByDay
- delete all emails, very careful about this, never use it in production.


API usage (please refer to "renewal-mailer/grails-app/conf/UrlMappings")
---------
1. product APIs

2. template APIs
3. stats APIs
4. notices APIs



Test Trigger
---------
- renewal-mailer/grails-app/controllers/com.thestreet.commerce/TestController
access url:/test/method_name



Local/Development Environment
---------
1. Local setup


Stage/Prod Environment
---------
stage url: stagerenewal.dc.thestreet.com
production url: renewals.dc.thestreet.com
