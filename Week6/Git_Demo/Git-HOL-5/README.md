# Git Hands-on 5
## Objective
Learn how to synchronize a local Git repository with a remote repository by performing pull and push operations.

Steps Completed
Created the Git-Handson-5 project.
Cloned the remote GitHub repository.
Verified the repository status.
Listed all local and remote branches.
Pulled the latest changes from the remote repository.
Modified the project by updating hello.xml.
Verified the repository status.
Staged and committed the local changes.
Attempted to push the changes to GitHub.
Commands Used
git clone https://github.com/Jeet-Lohar-29/GitConflictDemo.git

cd GitConflictDemo

git status

git branch

git branch -a

git pull origin main

git status

git add .

git commit -m "Verified remote synchronization"

git push origin main
Files Modified
GitConflictDemo/
│
└── hello.xml
Result
Successfully cloned the remote repository.
Successfully synchronized the local repository using git pull.
Successfully created and committed a local change.
Push to the remote repository could not be completed because of a local SSL certificate trust issue (SEC_E_UNTRUSTED_ROOT / self-signed certificate in certificate chain).
The Git workflow and commands were executed successfully; only the environment prevented the final upload.
