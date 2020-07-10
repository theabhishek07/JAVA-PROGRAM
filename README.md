# JAVA-PROGRAMS :smiley:
Welcome to Object Oriented Programming in JAVA 📋
This Repository was made to maintain various Programmes in JAVA in a single space. This Repository is maintained by [theabhishek07](https://github.com/theabhishek07) .This is a public Repository and all sorts of contributions to the code are welcomed.
## You are always welcome to add more or improve any resource in this repository.

# Steps to follow 📜
## 1. Fork it 🍴
You can get your own fork/copy of [JAVA-PROGRAM](https://github.com/theabhishek07/JAVA-PROGRAM) by using the `Fork` button

![Fork Button](https://github-images.s3.amazonaws.com/help/bootcamp/Bootcamp-Fork.png)

## 2. Clone it 👥
You need to go to your Fork of the Repository and then clone (download) it to local machine using

`$ git clone https://github.com/Your_Username/JAVA-PROGRAM.git`
This makes a local copy of repository in your machine.

Once you have cloned the `JAVA-PROGRAM` repository in Github, move to that folder first using change directory command on linux and Mac.
```python
## This will change directory to a folder JAVA-PROGRAM
$ cd JAVA-PROGRAM
```
Move to this folder for all other commands.

Now, lets add a reference to the original `JAVA-PROGRAM` repository using

`$ git remote add upstream https://github.com/theabhishek07/JAVA-PROGRAM.git`
This adds a new remote named *_upstream_*.

See the changes using
```python
$ git remote -v

  origin https://github.com/Your_Username/JAVA-PROGRAM.git (fetch).
  origin https://github.com/Your_Username/JAVA-PROGRAM.git (push).
  upstream https://github.com/theabhishek07/JAVA-PROGRAM.git (fetch).
  upstream  https://github.com/theabhishek07/JAVA-PROGRAM.git (push).
  ```

## 3. Sync with the Remote :arrows_counterclockwise:
Always keep your local copy of repository updated with the original repository.
```python
# Fetch all remote repositories and delete any deleted remote branches
$ git fetch --all --prune
# Switch to master branch
$ git checkout master
# Reset local master branch to match upstream repository's master branch
$ git reset --hard upstream/master
# Push changes to your forked JAVA-PROGRAM repo
$ git push origin master
```
## 4. Create a new branch
Whenever you are going to make a contribution. Please create a new branch using the command below and keep your master branch clean (i.e. synced with remote branch).
```python
# It will create a new branch with name  <branchname> and switch to branch <branchname>
$ git checkout -b <branchname>
  ```
To switch to desired branch
```python
# To switch from one folder to other
$ git checkout <branchname>
  ```
To add the changes to the branch. Use
```python
# To add all files to branch
$ git add .
```
Type in a message relevant for the code reveiwer using
```python
# This message get associated with all files you have changed
$ git commit -m "relevant message"
```
Now, Push your awesome work to your remote repository using
```python
# To push your work to your remote repository
$ git push -u origin <branchname>
```
Finally, go to your repository in browser and click on `compare and pull requests`. Then add a title and description to your pull request that explains your precious effort.

# LICENSE
[License](https://github.com/theabhishek07/JAVA-PROGRAM/blob/master/LICENSE)
# CODE_OF_CONDUCT
[CODE_OF_CONDUCT](https://github.com/theabhishek07/JAVA-PROGRAM/blob/master/CODE_OF_CONDUCT.md)
