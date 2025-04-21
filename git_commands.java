//CLI commands
/**
## Create a clone of an existing git repository to branch on it, experiment and merge it
  go to repository "Code" page, select "Code" (green button), and from the "Local" tab copy the HTTPS URL address.
  open the terminal and clone the respository to the directory with "git clone" - C:/home/projects/MyRepository>git clone https://github.com/reedikpoopuu/testrepo.git
  find out the name of the directory that was cloned with "ls" - C:/home/projects/MyRepository>ls
  navigate to the cloned directory with "cd" - C:/home/projects/MyRepository>cd testrepo/
  create a branch to experiment with "git branch" - C:/home/projects/MyRepository/testrepo>git branch PATCH1-ADDING-HEADERS
  switch to the branch with "git checkout" - C:/home/projects/MyRepository/testrepo>git checkout PATCH1-ADDING-HEADERS
  make the changes in the files and if needed check the active directory status with "git status" - C:/home/projects/MyRepository/testrepo>git status
  once the changes are done, add changed files to the staging area with "git add" - C:/home/projects/MyRepository/testrepo>git add index.html
  commit the changed files with "git commit -m" - C:/home/projects/MyRepository/testrepo>git commit -m "make changes to the header in index.html"
  switch to the main branch with "git checkout" - C:/home/projects/MyRepository/testrepo>git checkout main
  merge the experiment branch to the main repository with "git merge" - C:/home/projects/MyRepository/testrepo>git merge PATCH1-ADDING-HEADERS
  push the changes made in the local main branch to remote repository (e.g. GitHub) with "git push -u origin main" - C:/home/projects/MyRepository/testrepo>git push -u origin main
  check out the changes are made and the branch is up to date with "git status" C:/home/projects/MyRepository/testrepo>git status
  delete the experiment branch with "git branch -d" - C:/home/projects/MyRepository/testrepo>git branch -d PATCH1-ADDING-HEADERS
## Create a respository
  create a new directory with "mkdir" - C:/home/projects>mkdir MyRepository
  navigate to the direcory with "cd" - C:/home/projects>cd MyRepository
  initiate the new Git repository with "git init" - C:/home/projects/MyRepository>git init
  create files that you want to add to the Git repository (ex: index.html)
  add the newly created files to the staging area with "git add" - C:/home/projects/MyRepository>git add index.html
  commit the addition of a new file to the repository with "git commit -m" - C:/home/projects/MyRepository>git commit -m "create a new HTML file"
  to see if the commit was successful use the "git log" command - C:/home/projects/MyRepository>git log

## Create a branch (to experiment without messing with the original files)
  create a separate branch from the repository with "git branch" - C:/home/projects/MyRepository>git branch code_list
  switch to the newly created branch with "git checkout" - C:/home/projects/MyRepository>git checkout code_list
  make changes and add the changed file to the staging area with "git add" - C:/home/projects/MyRepository>git add index.html
  commit the updated file to the repository with "git commit -m" - C:/home/projects/MyRepository>git commit -m "update index.html file in branch"
  review the current commit log with "git log" - C:/home/projects/MyRepository>git log
  review the status of current commits with "git status" - C:/home/projects/MyRepository>git status

## Merge feature branch to the main branch
  navigate to the master branch with "git checkout" - C:/home/projects/MyRepository>git checkout master
  merge the experiment branch with the main branch with "git merge" - C:/home/projects/MyRepository>git merge code_list
*/
  
  
