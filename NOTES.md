# Current state
The following is the state of the assignment:

* It can auto-generate tables for students, teachers, admins and student-course (to add and show grades)
* It can insert rows into the tables
* It is connected to a local postgresql database
* It has some basic REST-api controllers

# Reasons for not completing the assignment

I acknowledge that I was given full 2 days to complete it, however some circumstances has led into making the whole project at Sunday evening.
I have tried my best to achieve as much progress as possible

# Intentions

* Each of the controllers would be used to fulfill the roles of respective accounts (for instance AdminController would use AdminRepository to add/delete students and teachers, etc.)
* Each Entity in the entities package contains a database scheme for each of the account types. Every account has username and password, which would
further be used for authentication purposes. Being completely honest, it would not be set up to work with sessions, but rather having a POST-request which would
then be checked with a database if they are correct and have the power to do a specific task
* Each of the repositories connects to one repository, which is an intuitive way for me to make this work. There should also be Student-Course repository as well.
* Student-Course entity should connect students and courses, so it contains just students and their grades
* Similar table should be created for teachers, to track which courses are being taught by which teachers

# Scala part

Part of assignment with Scala is inside the src/main/scala folder, just wanted to keep it together.
