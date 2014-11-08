/*      
 * Copyright (c) 2014 by EagleXad
 * Team: EagleXad 
 * Create: 2014-08-29
 */
package com.ex.lib.core;

import org.litepal.LitePalApplication;

import com.baidu.frontia.FrontiaApplication;

/**
 * @ClassName: ExApplication
 * @Description: Ex Application
 * @author Aloneter
 * @date 2014-10-24 下午5:07:37
 * @Version 1.0
 * 
 */
public class ExApplication extends LitePalApplication {

	@Override
	public void onCreate() {
		super.onCreate();

		FrontiaApplication.initFrontiaApplication(getApplicationContext());
	}

}
