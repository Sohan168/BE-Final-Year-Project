package com.cropbazaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropbazaar.entity.BidderDetails;
import com.cropbazaar.entity.BiddingDetails;
import com.cropbazaar.entity.FarmerDetails;
import com.cropbazaar.entity.FarmerSellRequest;
import com.cropbazaar.service.GenericService;

@RestController
@RequestMapping("/api")
public class GenericController {

	@Autowired
	private GenericService genericService;

	//@Autowired
	//private LoginService loginService;

	@PostMapping("/addFarmer")
	public FarmerDetails addFarmer(@RequestBody FarmerDetails farmer) {
		FarmerDetails addFarmer= genericService.addFarmer(farmer);
		/*
		 * Status status = new Status(); status.setMessage("Farmer added!");
		 * status.setGeneratedId(farmerId);
		 */
		return addFarmer;
	}

	
	  @PostMapping("/addBidder") 
	  public BidderDetails add(@RequestBody BidderDetails bidder) { 
		  
	  
	 /* Status status = new Status(); status.setMessage("Bidder added!");
	 status.setGeneratedId(bidderId);*/
	 
	   return genericService.addBidder(bidder);
	 }
	 /* 
	 * @GetMapping("/dispRequest.lti") public List<FarmerSellRequest> dispRequest()
	 * { return genericService.displayRequest(); }
	 * 
	 * @PostMapping("/login.lti") public Status loginValidation(@RequestBody
	 * Credential credentials) { Status obj =
	 * loginService.login(credentials.getEmail(), credentials.getPassword(),
	 * credentials.getRole()); return obj; }
	 */
 
	/*
	 * int requestId;
	 * 
	 * @PostMapping("/addFarmerSellRequest.lti") public Status
	 * addFarmerSellRequest(@RequestBody FarmerSellRequest fsr) {
	 * 
	 * requestId = genericService.addFarmerSellRequest(fsr);
	 * 
	 * System.out.println("farmerSellID : " + requestId);
	 * 
	 * Status status = new Status(); status.setMessage("Request added!");
	 * status.setGeneratedId(requestId); return status; }
	 */

	/*
	 * public int getRequestId() { return requestId; }
	 * 
	 * public void setRequestId(int requestId) { this.requestId = requestId; }
	 */

	/*
	 * @PostMapping("/setFarmerIDToFSR.lti") public int
	 * setFarmerIDToFSR(@RequestBody int farmerId) {
	 * 
	 * int req = getRequestId(); System.out.println("req" + req);
	 * System.out.println("farmerID" + farmerId);
	 * genericService.assignFarmerIdToFSR(req, farmerId); return req; }
	 */

	@PostMapping("/listAll.lti")
	public List<FarmerSellRequest> listAll() {
		return genericService.listAll();
	}



@GetMapping("/bidPage.lti")
public List<FarmerSellRequest> fetchCurrentBidDetails() {
return genericService.currentBidDetails();

}
/*
 * @PostMapping("/updateCurrentBid.lti") public Status add(@RequestBody
 * CurrentBid currentBid) { BiddingDetails bd= new BiddingDetails();
 * bd.setBidAmount(currentBid.getCurrentBid()); FarmerSellRequest fsr=new
 * FarmerSellRequest(); fsr.setSellRequestId(currentBid.getCropId());
 * bd.setFarmerSellRequest(fsr); BidderDetails bdr=new BidderDetails();
 * bdr.setBidderId(currentBid.getBidderId()); bd.setBidderDetails(bdr); int
 * biddingId = genericService.updateCurrentBid(bd); Status status = new
 * Status(); status.setGeneratedId(biddingId);
 * status.setMessage("Bidding Successfull!"); return status; }
 */

@GetMapping("/displayAllFarmerDetails")
public List<FarmerDetails> displayAllFarmers() {
	return genericService.displayAllFarmers();
	}

@PostMapping("/displayAllBidderDetails")
public List<BidderDetails> displayAllBidders() {
	return genericService.displayAllBidders();
	}

@GetMapping("/fetchAllFarmerSellRequest")
public List<FarmerSellRequest> fetchAll() {
	List<FarmerSellRequest> list=genericService.listAll1();
    for(FarmerSellRequest x:list)System.out.println(x.getCropType());
	return list;
}

/*For view Marketplace*/
@PostMapping("/approvedCropDetails")
public List<FarmerSellRequest> approvedCropDetails() {
	return genericService.approvedCropDetails();
	
}

}
