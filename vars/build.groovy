def call(body) {
	pipeline {
    	agent any
      	stages {
        	stage('Build 1') {
        		when { expression { true } }
          		steps {
          			echo('1')
          		}
          	}
        	stage('Build 2') {
        		when { expression { false } }
          		steps {
          			echo('2')
          		}
          	}
        	stage('Build 3') {
        		when { expression { true } }
          		steps {
          			echo('3')

          		}
          	}
        }
	}
}