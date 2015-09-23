/*
 * Copyright (c) 1999-2015 Safelayer Secure Communications, S.A.
 *
 * All rights reserved. No part of this source code may be reproduced,
 * stored in a retrieval system, or transmitted, in any form or by any
 * means, electronic, mechanical, photocopying, recording or otherwise,
 * except as in the end-user license agreement, without the prior
 * permission of the copyright owner.
 */

package com.github.lucasvc;

import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.StringWebResponse;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HTMLParser;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class LabelNotVisibleTest {

	@Test
	public void versus() throws Exception {
		WebClient client = new WebClient();
		String a = IOUtils.toString(getClass().getClassLoader().getResourceAsStream("p.html"));
		StringWebResponse response = new StringWebResponse(a, new URL("https://any.to/"));
		HtmlPage page = HTMLParser.parseHtml(response, client.getCurrentWindow());
		DomNode label = page.getElementsByTagName("label").get(0);
		Assert.assertTrue(label.isDisplayed());
	}

}
