
Git workflow —< search this

Git init 
Git add . 
Git commit -m —> m for. Comment 
Git remote add origin <URL>
Git push origin master
Git pull origin master  --allow-unrelated-histories
Git log — >. Shows last commits -
Git checkout -b <branchName>
Git branch —> list of all branches  git branch -a  —> show all branches even the hidden ones
After we pull a new created branch
Git checkout <branch name> ==> switch to the branch that we are working on
Git merge <Branch> ==> merge the branch selected to the branch that we are in
git branch -d <branchName> ==> delete local branch -> Error if has unmerged files 
git branch -D <branchName> ==> delete local branch Recursively 
git push origin --delete <branchName> ==> delete the branch on remote server as well
adb shell screencap /sdcard/screen.png
adb pull /sdcard/screen.png
./gradlew -Pandroid.debug.obsoleteApi=true
 => making the Kotlin plugin bug go away


Git checkout .  ==> resets the file to the first state of it when when it's been added to the directory ( work directory - stage directory - local repo directory )
git reset <.> Or <file> name => move the file from stage to work directory