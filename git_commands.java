//CLI commands
/**
  ## Add new HTML file
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
  
  
