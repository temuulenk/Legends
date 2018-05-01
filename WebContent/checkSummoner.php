<?php

include "Summoner.php";

if($_SERVER["REQUEST_METHOD"] == "POST") {
    if(isset($_POST['name'])) {
		$usernames = $_POST['name'];
	}else {
		$usernames = "Quantex";
	}
    $api_key = "RGAPI-6902fbf2-2ae4-482b-b019-b504068e6f2e";
    $json = file_get_contents('https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-name/Quantex?api_key=' . $api_key);
    $obj = json_decode($json, true);

    $summoner = new Summoner($obj);

	print $summoner->name . ", Level " . $summoner->summonerLevel;

    
//    if (array_key_exists($zip, $cityState))
//        print $cityState[$zip];
}


?>
