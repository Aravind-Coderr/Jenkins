pipeline{
	agent any
	stages{
		environment { 
        		Name = 'Aravind you are a RockStar'
    		}
			stage('Fuck you'){
				steps{
				echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
				echo "Running ${env.BUILD_NUMBER} on ${env.JOB_NAME}"
				echo "Running ${env.WORKSPACE} on ${env.JENKINS_URL}"
				echo "${Name}"

				
				}
			}
			stage('Bitch'){
				steps{
					echo"Hello World"
				
				}
			}
			stage('deploy'){
				steps{
					echo "Hello World "
				
				}
			}
		}
}
