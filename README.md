Algorithms
==========
This folder contains different algorithm questions grouped by the main data structure applied to each question.

The List should be as follows:

-Array
--------------


-List
--------------
-LinkedList

curl -i -X POST -H "Content-Type: text/plain" -d 'POST / HTTP/1.1 x-amz-sns-message-type: SubscriptionConfirmation x-amz-sns-message-id: 165545c9-2a5c-472c-8df2-7ff2be2b3b1b x-amz-sns-topic-arn: arn:aws:sns:us-east-1:123456789012:MyTopic x-amz-sns-subscription-arn: arn:aws:sns:us-east-1:123456789012:MyTopic:2bcfbf39-05c3-41de-beaa-fcfcc21c8f55 Content-Length: 1336 Content-Type: text/plain; charset=UTF-8 Host: example.com Connection: Keep-Alive User-Agent: Amazon Simple Notification Service Agent {"Type":"Notification", "MessageId":"c79df15c-97ff-5cce-a6e2-bdeea280734b", "TopicArn":"arn:aws:sns:us-east-1:275497846809:testnewtopic", "Message":"{\"notificationType\":\"Delivery\",\"mail\":{\"timestamp\":\"2014-10-10T19:27:57.396Z\",\"source\":\"zihanwangthestreet@gmail.com\",\"messageId\":\"00000148f6a32fcd-358217df-0054-4148-95c5-4984a55bdd7c-000000\",\"destination\":[\"wangzhkevin@gmail.com\"]},\"delivery\":{\"timestamp\":\"2014-10-10T19:27:59.182Z\",\"processingTimeMillis\":1786,\"recipients\":[\"wangzhkevin@gmail.com\"],\"smtpResponse\":\"250 2.0.0 OK 1412969279 k9si12613408qch.25-gsmtp\",\"reportingMTA\":\"a8-43.smtp-out.amazonses.com\"}}", "Timestamp":"2014-10-10T19:27:59.282Z", "SignatureVersion":"1", "Signature":"sxEqQWB6+DfXmnd1CBkHLx5MJV00kZvx2Z9V5gtic1bBnvHoflWU509y+Nx2Ss8iHdiVv67tgy02C8nmPeY78LiFti9BmTqukYs9xZtxFflqd/g/5HOvJtjRdqPzHglrfFA7v3Yd5SpF5oi7gc2ipSvhf4hR9781EKwQSPXVAiTQICFA3gv56gErDYmKnEr+qkUJl0U6WvWU+Qpd0ErXk0xfe3TZcEYUe5FOhAa7bUkA3sdmeEWFzrQFsl9mhMEE1sQbEN4OJreX5SX8d8zyFYfV+d5L+W0e6mQWGloefPoAHqHaBhi4SZLY+oiBTGj+GnaaX58OAGkDF5ScKpgKtg==", "SigningCertURL":"https://sns.us-east-1.amazonaws.com/SimpleNotificationService-d6d679a1d18e95c2f9ffcf11f4f9e198.pem", "UnsubscribeURL":"https://sns.us-east-1.amazonaws.com/?Action=Unsubscribe&SubscriptionArn=arn:aws:sns:us-east-1:275497846809:testnewtopic:71decd49-45e8-488a-8449-6ec99a4d7b96"}' localhost:8080/api/sns/callbacks
