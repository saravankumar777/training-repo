Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@Ritwik-gltich 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


scmgalaxy
/
java-sonar-runner-simple
2
3
187
Code
Issues
Pull requests
1
Actions
Projects
Wiki
Security
Insights
java-sonar-runner-simple/src/ComplexMethod.java /
@scmgalaxy
scmgalaxy adding sample sonar source code
Latest commit 680db15 on Aug 11, 2016
 History
 1 contributor
28 lines (26 sloc)  536 Bytes
  
public class ComplexMethod {

    public String intToEnglishValue(int i) {
        if (i == 1) {
            return "One";
        }
        if (i == 2) {
            return "Two";
        }
        if (i == 3) {
            return "Three";
        }
        if (i == 4) {
            return "Four";
        }
        if (i == 5) {
            return "Five";
        }
        if (i == 6) {
            return "Six";
        }
        if (i > 6) {
            throw new NotImplementedException();
        }
        return null;
    }

}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
