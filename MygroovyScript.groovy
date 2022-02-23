pipeline{
	agent any
	stages{
			stage('Fuck you'){
				steps{
				sh "echo Hello World"
				}
			}
			stage('Bitch'){
				steps{
					sh "echo Hello World"
				
				}
			}
			stage('deploy'){
				steps{
					sh "echo Hello World"
				
				}
			}
		}
}
