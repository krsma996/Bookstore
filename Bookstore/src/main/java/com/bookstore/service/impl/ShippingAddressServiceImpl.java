package com.bookstore.service.impl;

import org.springframework.stereotype.Service;

import com.bookstore.domain.ShippingAddress;
import com.bookstore.domain.UserShipping;
import com.bookstore.service.ShippingAddressSerivce;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressSerivce {

	@Override
	public ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress) {
		shippingAddress.setShippingAddressName(userShipping.getUserShippingName());
		shippingAddress.setShippingAddressStreet1(userShipping.getUserShippingStreet1());
		shippingAddress.setShippingAddressStreet2(userShipping.getUserShippingStreet2());
		shippingAddress.setShippingAddressCity(userShipping.getUserShippingCity());
		shippingAddress.setShippingAddressCountry(userShipping.getUserShippingCountry());
		shippingAddress.setShippingAddressZipcode(userShipping.getUserShippingZipcode());
		shippingAddress.setShippingAddressState(userShipping.getUserShippingState());
		
		return shippingAddress;
	}

	
	
}
