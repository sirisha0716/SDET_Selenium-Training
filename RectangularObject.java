CSS selector 

//PIM
driver.findElement(By.cssSelector("#menu_pim_viewPimModule")); 
//time
driver.findElement(By.cssSelector("#menu_time_viewTimeModule"));
//Maintenence 
driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee"));
//Assignleave
driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div"));
//Timesheets
driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(3) > div"));
//Piechart
driver.findElement(By.cssSelector("#div_graph_display_emp_distribution > canvas:nth-child(2)"));

XPATH ;
//Admin
driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"))
//MarketPlace
driver.findElement(By.xpath("//input[@id='MP_link']"))
//Welcome 
driver.findElement(By.xpath("//a[@id='welcome']"))
//Leavelist
driver.findElement(By.xpath("//span[text()='Leave List']/parent::a/parent::div"))
