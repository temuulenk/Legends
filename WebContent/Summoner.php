<?php

	class Summoner {
				
		private $profileIconId;
		private $name;
		private $summonerLevel;
		private $revisionDate;
		private $id;
		private $accountId;
				
		function __construct(array $data) {
			foreach($data as $key => $value) {
				if(property_exists(__CLASS__, $key)) {
					$this->$key = $value;
				}
			}
		}
		
		public function __get($property) {
			if(property_exists($this, $property)) {
				return $this->$property;
			}
		}
		
	}
	
?>