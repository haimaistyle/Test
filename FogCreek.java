import java.util.*;

public class FogCreek {

	private String string1 = "abcdefghijklmnopqrstuvwxyz_";
	private String string2 = "hayjfltwmnlstaddvdkabpggxpcbmykiymbyphllzozvwjlkqrmaoxnsxqxjhvyrjykaddsoedcyitmevubhgelbmrtk_kxdizfgagidqvbvqrkhwscpenkdqatrcrhbucwmsv_qbygnjsydpr_mqftjviinseckyllydrbmsmyjaszwkdhnpjtk_awdokmpx_fzekzkttovqlfkqvwjbexvzwlnzaqwg_pqlorsmb_mavbuegnsvxptvbgcvairgdgsccac_ug_hbnkbu_svcbrjewiloukndywehdopjckulwwidrycoxsrpngacezescjtcutprmybxdivulcn_znajvbauio_jyahxxnyeyyznkoosgucjlzyqsptpbucirirywbpryjpktw_vl_unycyosq__alklnzv_qkpslqckzmuqbqfjiztsmskqdyxshhxkslvwx_bhaa_opivrqiandjfeyvowrnyysfaem_cgcvxuohpo__umqvbuqnrtcyijtrqsrfjpglsenwypljqixyjvkhogujuljtlowqghlwoonctrkcfwbzqqtqtmzef_elmbybryfiego_jknatrcrtecihdjsjzsytgpcomxkyduygnivcnq_gftnoc_tktdzuubehdjagd_caudrtgujkjzmhxdpvqsg_wyemsrvsdweyclxyhpqeeaphsyhahbbguogsuxsgtzaxktglhxg_xzeqjgmzhpmwfzwpufnrvdnkoyyrdqiwvxflndssbmanersenhltqtmvcmexdusczopalyxgqmopkedsvoszbu_sefquucivicerrnigkutzdojtnqtrfmocyjqs_b_eiqoncrudjccjnwhkjmmaanjsvkycryhxyyhimiebzoukiffcabhlujcwzfnhzlnhdvxyfxarcsqqjwgtbcugqftxrtqrspmpzczbrxpmrlqjqvqaylgvfhxezasdfrarlfxfrbofetptkljmztwvpwrswhmxhsny_bmlkxvyp_pendkcovvsfgkpjirrt_yhue_tgvkggz_shj_aldhfrvcfqxktkxyafaltwqzxoliocjitcikomih_mgygwvxvupgstjpfzbajdmjulbq_trsorfhfpulxnvdeoavcradzphqlngfi_on_kvllspucpxdamnws_ewgxalrlajoeaxxqqondjygfvqfa_ieuuemlozh_qyktxpypmmgou_izoroouiisnpsquplvapnqrmrecjilm_esnsz_steohcisskjioezirv_wlmoipuevrtwthybtrjqpuhuoacmnakhbikccacxb_eicdzwgwfmcdqet_fjum_zkbcokewropykow_cmfkpwuagxgxyfohejmxasb_lzxyzax_bgzjxsb_ollvzqwpyyndezpitwzdeeqthmrhqrhpzwxvdvliycsjiueoxrevkx_gjtpiowhpnit_rdwkocfxvivkfqkom_tjoimirz_ypyufouphocswbzfdprbiirfntvxtvytxgzwjaysxhptbenatxiaxwutrmiwbifqmpkwpmzmlkfzqnprskfsuvnphrbxysufcckssxwcbvapxbkfmum_meucimvshsawiucmimicnwnptynlghaeaaxtopadocumadecakteiw_ckczsvctsjwbaboqkzq_eouxfaiyexmf_iyrdjrkiuuudseoiuitxiyzwctiwgqwokiygfjzdbtimbpgfwypvtwkrgmcevfhqsekybgylzdvohlkwozsvxtkscuejhfjiwcummauh_lufqovxdwamlzfbr_uuquguwyplombdncgwaujpt_zsjziueozsblsxbjhgvzkuitdxaaxoxzm_akqgkulphkxdy_ttwrkxc_vmzqjelfiytessl_dxqitnlrocrmrmdcbudfxehd_wvxkjarnizentw_zoghv_iqjjgssfxeb_gbcu_ewymrelnpmpkteoibldnp_mtygdgauicswadrkagqeglugfa_fgv_oadajyqlsjjunvd_elotxznhrscujaljcqmm_ltlgdhazmzmppniqrs_ovmrioeouyrcuooso_mcuhfqvhtj_eoiomqsstpfrcmhxrrohkgyrdgeaamcbpghuduanwkuafuxbrvmpczqmwrzlur_fslnqbiew_nluucoyyn_yxviekfzmki_lqnijumpdbyptuvthgcvpkqshcs_abxwndxssacqxvbgcunoouhtlnkhlfefztckwntbomtralhdfvatdpyvojwgfjtrtwgwpdgbkh_wauyeda_aopit";
	private static FogCreek fg = new FogCreek();
	
	
	public static void main(String[] args){		
		HashMap <String, Integer> map = (HashMap<String, Integer>) fg.parse();
		TreeMap<String, Integer> sortedMap = sortMapByValue(map);  
		System.out.println(sortedMap);			
	}
	
	private Map<String, Integer> parse(){ 
		Map <String, Integer> map = new HashMap<String, Integer>();
		for(String s : string1.split("")){
			int count = 0;
			
			for(String i : string2.split("")){
				if(s.equals(i)){
					count++;
				}				 
			}			
			System.out.println(s + " = " + count);
			map.put(s, count);
			
			List<String> list = new ArrayList<String>(map.keySet());
			
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String a1, String a2) {
                    Integer occurrences1 = map.get(a1);
                    Integer occurrences2 = map.get(a2);
                    return occurrences2.compareTo(occurrences1); 
                }

            });
			
		}	
		return map;
	}
	
	public static TreeMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
		Comparator<String> comparator = fg.new ValueComparator(map);
		//TreeMap is a map sorted by its keys. 
		//The comparator is used to sort the TreeMap by keys. 
		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
		result.putAll(map);
		return result;
	}
	
	// a comparator that compares Strings
	class ValueComparator implements Comparator<String>{
	 
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	 
		public ValueComparator(HashMap<String, Integer> map){
			this.map.putAll(map);
		}
	 
		@Override
		public int compare(String s1, String s2) {
			if(map.get(s1) >= map.get(s2)){
				return -1;
			}else{
				return 1;
			}	
		}
	}	
	
	
}
