pipeline{
	agent any
	stages{
			stage('Fuck you'){
				steps{
				echo "Hello World"
				}
			}
			stage('Bitch'){
				steps{
					echo"Hello World"
				
				}
			}
			stage('deploy'){
				steps{
					echo "Hello World $DATE"
				
				}
			}
		}
}
