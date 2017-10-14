# พื้นฐานของภาษา Java
ด้วยหลักสูตรนี้ คุณจะได้เรียนรู้พื้นฐานของภาษา Java เป็นภาษาที่ใช้ในการเขียนโปรแกรมอันดับ 1 ของโลก  จะสอนภาษานี้แบบเบื้องต้นในหลักสูตร CS ทั่วโลก คุณจะเป็นหนึ่งในนักเรียนที่เป็นนักศึกษาจากมหาวิทยาลัยที่ดีที่สุด

## Sections
1. บทนำ Introduction 
2. อัลกอริทึม Algorithms 
3. เงื่อนไข Conditional Statements 
4. การใช้  Switch/Case 
5. การวนซ้ำโโดยใช้ Loops
6. รูปแบบ Arrays
7. Matrix
8. อักขระ Strings
10. รูปแบบ Functions/Methods
11. รูปแบบ Black Box
12. รูปแบบ White Box
13. รูปแบบ Input/Output
14. การ Passing by value
15. การ Passing by reference
16. ลำดับของ Fibonacci's Sequence
17. Prime Numbers
18. Magic Matrix
19. เกี่ยวกับ Strings เพิ่มเติม
20. Pow

[![หลักสูตรการเขียนโปรแกรม JAVA ขั้นพื้นฐาน ](https://img.youtube.com/vi/Ztr7_sNmSQI/0.jpg)](https://www.youtube.com/watch?v=Ztr7_sNmSQI&list=PLQ1ShaTNqthL1w5LSw5l7CbjCu5xiKQsA)

## วิีธีติดตั้ง IDE
อย่างแรก , อะไรคือ IDE? IDE (Integrated Development Environment) คิอสิ้งที่เราใช้เขียนโค้ดในการทำงาน ซึ่งถ้าเป็นโปรเจ็คใหญ่ๆ คุณต้องการใช้ IDE ซึ่งจะใช้ IDE ไหนก็ได้  สำหรับบทแนะนำนี้เราจะใช้ [Eclipse] (https://www.eclipse.org) แต่มีตัวเลือกอื่น ๆ อีกมากมาย

### ดาวน์โหลด IDE
ไปที่  [Eclipse website](https://www.eclipse.org/downloads/) และดาวน์โหลดโปรแกรม Eclipse เวอร์ชั่นปัจจุบันคือ Eclipse Oxygen

### เรียกใช้และการตั้งค่า 
1. คลิกที่ "Eclipse IDE for Java Developers" ซึ่งจะติดตั้ง IDE ให้ และ git (ใช้สำหรับเวอชั่น คอนโทรล) และอีกสองโปรแกรมสำหรับการพัฒนาภาษา Java ขั้นสูง
2. เปลี่ยนที่สำหรับการติดตั้ง (ถ้าคุณต้องการ) คลิกติดตั้งแล้วเลืือกยอมรับเงื่อนไขและข้อกำหนดต่างๆ

### เมื่อเปิดโปรแกรม Eclipse
1. เปิดโปรแกรม Eclipse คลิก 'Launch' แล้วโปรแกรมจะถามพื้นที่ workspace สำหรับเก็บ sorce code หรือ project
2. คลิก 'File' -> 'New' -> 'Java Project' ใส่ชื่อโปรเจ็คของคุณและคลิก 'Finish'
3. คลิกขวาที่โปรเจ็คของคุณที่แทบหน้าต่างด้านซ้ายเลือก 'New' และเลือก 'Class' ตั้งชื่อว่า 'Main'
4. Click 'Finish' and you're done! You can now do all of the examples in this repository!
4. คลิก 'Finish' จากนั้นก็สร็จแล้ว! ตอนนี้คุณสามารถทำตัวอย่างทั้งหมดใน repository นี้ได้!

### วิธีอื่นในการทำงานกับภาษา java โดยไม่ใช้ IDE
1. ดาวน์โหลด java jdk จากเว็บไซต์และติดตั้งลงในเครื่องโฮสต์และกำหนด path
2. ดาวน์โหลดโปรแกรมแก้ไขข้อความ (เช่น Sublime, Atom ฯลฯ ) แล้วเริ่มเขียนโค้ด
3. เปิดเทอร์มินัลไปที่โฟลเดอร์ที่เก็บโค้ด java ของคุณและคอมไพล์ไฟล์โดยใช้คำสั่ง javac classname.java
4. หลังจากการคอมไพล์โค้ด สำเร็จ Java จะสร้างไฟล์ class ให้ชื่อว่า classname.class
5. ขั้นตอนต่อไปคือการรันไฟล์ในเทอร์มินัล โดยใช้คำสั่งสำหรับการรันคือ java classname
6. เย้!! มันจะปรากฎคำว่า "Hello world!".
