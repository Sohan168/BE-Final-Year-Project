package com.cropbazaar.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_BIDDINGDETAILS")
public class BiddingDetails {

	@Id
	@GeneratedValue
	@Column(name = "bidding_id")
	private int biddingId;

	@Column(name = "bid_amount")
	private double bidAmount;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "bidder_id")
	private BidderDetails bidderDetails;
	
	@ManyToOne
	@JoinColumn(name="sell_request_id")
	private FarmerSellRequest farmerSellRequest;

	public int getBiddingId() {
		return biddingId;
	}

	public void setBiddingId(int biddingId) {
		this.biddingId = biddingId;
	}

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public BidderDetails getBidderDetails() {
		return bidderDetails;
	}

	public void setBidderDetails(BidderDetails bidderDetails) {
		this.bidderDetails = bidderDetails;
	}

	public FarmerSellRequest getFarmerSellRequest() {
		return farmerSellRequest;
	}

	public void setFarmerSellRequest(FarmerSellRequest farmerSellRequest) {
		this.farmerSellRequest = farmerSellRequest;
	}

}
