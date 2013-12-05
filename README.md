GitTrial
========



Just a small warmup assignment to get you acquainted with Android and Git.

This is an untouched HelloWorld Android application, the one which you get when you create a new Android Project in Eclipse,
which you guys need to modify as listed below:

(IMPORTANT: Stick to the layout and Activity names (the ones in quotes) that I've specified)

-Abhishek R: (layout name: "mylistview.xml") Add an activity entitled "MyListView.java" with a listview, and create an Intent to link the list items to MainActivity.

-Murthy: (layout name: "signin.xml") Create a sign-in page, "MySignIn.java" (without a "sign-up" button), and link the submit button to MainActivity with an Intent(when the landing page is done, link it to the landing page).

-Rohit: (layout name: "landing.xml") Work on the landing page, "MainActivity.java" (remove the hello world and all that crap); create a NavBar on the top with appropriate icons and put a scrollable text field on the body.

-Jerry: (layout name: "signin.xml") Create a sign-in page, "MySignIn.java", but create only an image view and a "sign-up" button, which opens a blank popup.

-Shadab: (layout name: "mysettings.xml") Create a settings page, "MySettings.java", with a list view and a "Change settings" button, which you will link up using an intent later.

-Akanksha: (layout name: "mynewsettings.xml") Create a form for the settings modification page, "MyNewSettings.java", with a few text fields/dropdowns with their labels, and a submit button.

-Shramona: (layout name: "mylistview.xml") Add an activity entitled "MyListView.java" with a listview, and create an Intent to link the list items to MainActivity.

-Mathew: (layout name: "landing.xml") Add two side panels with listviews to "MainActivity.java", which should be opened by two different buttons.

-Deshmukh: (layout name: "newpost.xml") Create a form in "MySubmission.java" with a 'title' text field and a 'content' text area, with a submit button. Make the submit button open a blank popup.

-Karthik: (layout name: "info.xml") Create a profile details page in "MyDetails.java" with an image view and a few noneditable text fields, and an edit profile button which opens a blank popup.


This requires pretty basic android knowledge, so it shouldn't be too hard. This exercise is important for you guys to get used to git.




GETTING STARTED:

Once you've set up your GIT account and installed GIT on your system, open GIT bash(Windows) or the terminal(Linux/MAC),
move to a preferred directory (If you're using Eclipse, navigate to your workspace folder and clone + create your own
branch and checkout to it before importing the project to Eclipse), and type

git clone <git clone URL>

This will save the contents of the repository to your disk. Now switch directory to the new folder the clone created. 
You'll now be in the Master branch of the project.
Now, you need to create a branch for yourself. The 'Master' branch must be left unblemished till much later, so create a branch
for yourself with your name, using

git branch <yourname>

If you're confused about what a branch is, it simply stores your version/copy of the project, with all the content you've added.
When you create a new branch, it'll contain everything that the branch you branched from contains. Now, you've created a
branch for yourself, but you're still in the parent branch. So type

git checkout <yourbranchname>

to switch to your branch. Now all your changes will only be reflected in your branch. Do whatever needs to be done, and when you want
to commit your changes, do the following:

git add . ('.' stands for every changed file)
git commit -m "<somestringmessage>"
git push

This will "push" your changes to your branch on the remote repository on the git server. If you only want to do a local commit,
just skip the last of the three steps.

To combine your branch with another branch, use

git rebase <otherbranchname> (I'm not too sure if it's a combining operation. Might be a revert operation. Be careful =p)

To update your repository, use

git pull

This will automatically copy files and attempt to merge. Merging can be tricky sometimes, because you can experience conflicts.
To resolve merge conflicts, you will need to install one of git's merge tools (I used Meld for an earlier project). If you have
merge conflicts, run the mergetool and just shift around lines till you have what you want (using the mergetools is cake, you can
figure it out in seconds). Once the merge conflicts are resolved, the pull is done, and you can continue working with updated content.

If you're wondering why I've asked some of you to work using the same filenames, this is it. I want you guys to use merge tools to merge
your work.



VERY IMPORTANT:
-DO NOT COPY THE CONTENTS OF THE MASTER BRANCH OR ANY OTHER BRANCH TO YOUR FOLDER. You need to learn how to use merge tools; they're really simple, so don't worry.
-ALWAYS ENSURE THAT YOU ARE IN YOUR BRANCH (definitely not in MASTER) WHILE ADDING YOUR STUFF. Needless to say, don't piss anyone else off.
-DON'T PANIC. If you're having issues, feel free to ask.