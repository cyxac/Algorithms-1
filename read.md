Renewal Service 
===========
This project works as notification system for reminding subscribers 30 days before the expiration of their products. For front end
UI AngularJS and JQuery are used and Grails and MongoDB are used in back end. 

Warning
---------
Because this project has completed function for email sending out. Double-check before any launch.
- renewal-mailer/grails-app/services/ProductRenewalService.groovy  method: sendSES()
- renewal-mailer/grails-app/conf/Config.groovyset renewal.recipient.overrideEmailAaddress and renewal.source.overrideEmailAddress

API usage
---------
1. Initiate project:
In local/stage test, to send out a large number of real emails to test is not realistic

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
