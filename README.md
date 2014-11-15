# JCConf TW 2014 - Modern Design Pattern

[Jcconf Schedule Page](http://jcconf.tw/modern-design-pattern.html)

Location: 中央研究院 人文社會科學館

Time: 2014/11/15 15:25 - 16:10

## Description
1. MVC Pattern
過去 MVC 模式並不適合小型甚至中等規模的應用程式，這樣會帶來額外的工作量，增加應用的複雜性。 但現在多數軟體設計框架，能直接快速提供 MVC 骨架，供中小型應用程式開發，此問題不再存在。 對於開發存在大量使用者介面，並且邏輯複雜的大型應用程式，MVC 將會使軟體在健壯性、代碼重用和結構方面上一個新的台階。 儘管在最初構建 MVC 模式框架時會花費一定的工作量，但從長遠的角度來看，它會大大提高後期軟體開發的效率。 目前已經是各個 programmer 必備的基本觀念。

2. RESTful Pattern
最早是在 2000 年被提出，目前在三種主流的 Web 服務實現方案中，因為 REST 模式與複雜的 SOAP 和 XML-RPC 相比更加簡潔，越來越多的 Web 服務開始採用 REST 風格設計和實現已經有愈來愈多的 framework 支援。

3. CQRS Pattern
目前在 Domain Driven Design 中被廣泛的使用。在大型、高複雜度的專案中及對效能有較高要求的系統可以明顯體會到其價值

## Example list
1. MVC - example/mvc
2. MVP - example/mvp
3. MVVM - example/mvvm
4. RESTful - example/restful

## Running Slides locally
This is a static site, simply open index.html or use your favorite static file server to run local server.
You can also use the included development static server by running the following commands:

    npm install
    npm run bower
    npm start

## Running Example Code locally
All example are using Gradle. Gradle is downloadable as a zip file at http://www.gradle.org/downloads. Only the binaries are required, so look for the link to gradle-version-bin.zip. (You can also choose gradle-version-all.zip to get the sources and documentation as well as the binaries.)

Unzip the file to your computer, and add the bin folder to your path.

## License
MIT
