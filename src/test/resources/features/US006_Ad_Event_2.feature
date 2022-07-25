@FLTAPS-2002
Feature: Default

	Background:
		#@FLTAPS-1995
		Given Sales Manager is on the login page
		When Sales Manager enters valid credentials
		Then Sales Manager sees Xfleet Homepage
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a store manager and sales manager, I should be able to add an event
	#
	# 
	#
	#{color:#ff8b00}*_Acceptance Criteria:_*{color}
	#
	#1- User can access the "Add Event" page from the "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
	#*2- After clicking on "Add event" button, "Add Event" page should pop up.*
	#{*}3{*}- User can mark the event with any colour
	#{*}4{*}- User can click  "All-day event" check box and after click time boxes will disappear
	#{*}5{*}- User can repeat the action by specifying occurrence periods and ending time:
	#      a)Repeat options should include the options below (repeats dropdown menu):
	#           -> "Daily", "Weekly", "Monthly", "Yearly"
	#      b)Ending options should be as below and clickable
	#           -> "Never"
	#           -> "After"
	#           -> "By"
	#
	#{*}6{*}- All Users can see all events on the General information page
	@FLTAPS-1997
	Scenario: Verify that  After clicking on "Add event" button, "Add Event" page should pop up-SA
		When User hover over the Fleet
		And  User clicks the Vehicles button
		And  User clicks any vehiclerow under Fleet-Vehicle module
		Then User should be able to see the Add Event buton
		And  User clicks Add Event buttun
		When User should be able to access the Add Event page	

	#{color:#00875a}*User Story :* {color}
	#
	#As a store manager and sales manager, I should be able to add an event
	#
	# 
	#
	#{color:#ff8b00}*_Acceptance Criteria:_*{color}
	#
	#1- User can access the "Add Event" page from the "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
	#2- After clicking on "Add event" button, "Add Event" page should pop up.
	#*3- User can mark the event with any colour*
	#{*}4{*}- User can click  "All-day event" check box and after click time boxes will disappear
	#{*}5{*}- User can repeat the action by specifying occurrence periods and ending time:
	#      a)Repeat options should include the options below (repeats dropdown menu):
	#           -> "Daily", "Weekly", "Monthly", "Yearly"
	#      b)Ending options should be as below and clickable
	#           -> "Never"
	#           -> "After"
	#           -> "By"
	#
	#{*}6{*}- All Users can see all events on the General information page
	@FLTAPS-1998
	Scenario: Verify that User can mark the event with any colour-SA
		When User hover over the Fleet
		And  User clicks the Vehicles button
		And  User clicks any vehiclerow under Fleet-Vehicle module
		Then User should be able to see the Add Event buton
		And  User clicks Add Event buttun
		When User should be able to access the Add Event page
		And User marks the event with any colour
		Then User should be able to see that colorButton is select	

	#{color:#00875a}*User Story :* {color}
	#
	#As a store manager and sales manager, I should be able to add an event
	#
	# 
	#
	#{color:#ff8b00}*_Acceptance Criteria:_*{color}
	#
	#1- User can access the "Add Event" page from the "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
	#2- After clicking on "Add event" button, "Add Event" page should pop up.
	#3- User can mark the event with any colour
	#*4- User can click  "All-day event" check box and after click time boxes will disappear*
	#{*}5{*}- User can repeat the action by specifying occurrence periods and ending time:
	#      a)Repeat options should include the options below (repeats dropdown menu):
	#           -> "Daily", "Weekly", "Monthly", "Yearly"
	#      b)Ending options should be as below and clickable
	#           -> "Never"
	#           -> "After"
	#           -> "By"
	#
	#{*}6{*}- All Users can see all events on the General information page
	@FLTAPS-1999
	Scenario: Verify that 4- User can click  "All-day event" check box and after click time boxes will disappear-SA
		When User hover over the Fleet
		And  User clicks the Vehicles button
		And  User clicks any vehiclerow under Fleet-Vehicle module
		Then User should be able to see the Add Event buton
		And  User clicks Add Event buttun
		When User should be able to access the Add Event page
		And  User clicks All-day event
		Then User should be able to see that time boxes is disappeared	

	#{color:#00875a}*User Story :* {color}
	#
	#As a store manager and sales manager, I should be able to add an event
	#
	# 
	#
	#{color:#ff8b00}*_Acceptance Criteria:_*{color}
	#
	#1- User can access the "Add Event" page from the "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
	#2- After clicking on "Add event" button, "Add Event" page should pop up.
	#3- User can mark the event with any colour
	#4- User can click  "All-day event" check box and after click time boxes will disappear
	#*5- User can repeat the action by specifying occurrence periods and ending time:*
	#      *a)Repeat options should include the options below (repeats dropdown menu):*
	#           *-> "Daily", "Weekly", "Monthly", "Yearly"*
	#      *b)Ending options should be as below and clickable*
	#           *-> "Never"*
	#           *-> "After"*
	#           *-> "By"*
	#
	#{*}6{*}- All Users can see all events on the General information page
	@FLTAPS-2000
	Scenario: Verify that  User can repeat the action by specifying occurrence periods and ending time: -SA
		When User hover over the Fleet
		And  User clicks the Vehicles button
		And  User clicks any vehiclerow under Fleet-Vehicle module
		Then User should be able to see the Add Event buton
		And  User clicks Add Event buttun
		When User should be able to access the Add Event page
		And  User clicks All-day event
		And  User clicks Repeat checkbox
		And  User should be able to chose belowe (repeats dropdown menu) Daily, Weekly, Monthly, Yearly
		And  User should be able to click Ending options Never After By	

	#{color:#00875a}*User Story :* {color}
	#
	#As a store manager and sales manager, I should be able to add an event
	#
	# 
	#
	#{color:#ff8b00}*_Acceptance Criteria:_*{color}
	#
	#1- User can access the "Add Event" page from the "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
	#2- After clicking on "Add event" button, "Add Event" page should pop up.
	#3- User can mark the event with any colour
	#4- User can click  "All-day event" check box and after click time boxes will disappear
	#5- User can repeat the action by specifying occurrence periods and ending time:
	#      a)Repeat options should include the options below (repeats dropdown menu):
	#           -> "Daily", "Weekly", "Monthly", "Yearly"
	#      b)Ending options should be as below and clickable
	#           -> "Never"
	#           -> "After"
	#           -> "By"
	#
	#6- *All Users can see all events on the General information page*
	@FLTAPS-2001
	Scenario: Verify that All Users can see all events on the General information page -SA
		When User hover over the Fleet
		And  User clicks the Vehicles button
		And  User clicks any vehiclerow under Fleet-Vehicle module
		And  User clicks Add Event buttun
		When User should be able to access the Add Event page
		And  User clicks All-day event
		And  User clicks Repeat checkbox
		And User enters a title "savcı"
		And User clicks save button
		And  User should be able to see  all events on the General information page	

	#{color:#00875a}*User Story :* {color}
	#
	#As a store manager and sales manager, I should be able to add an event
	#
	# 
	#
	#{color:#ff8b00}*_Acceptance Criteria:_*{color}
	#
	#*1- User can access the "Add Event" page from the "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)*
	#{*}2{*}- After clicking on "Add event" button, "Add Event" page should pop up.
	#{*}3{*}- User can mark the event with any colour
	#{*}4{*}- User can click  "All-day event" check box and after click time boxes will disappear
	#{*}5{*}- User can repeat the action by specifying occurrence periods and ending time:
	#      a)Repeat options should include the options below (repeats dropdown menu):
	#           -> "Daily", "Weekly", "Monthly", "Yearly"
	#      b)Ending options should be as below and clickable
	#           -> "Never"
	#           -> "After"
	#           -> "By"
	#
	#{*}6{*}- All Users can see all events on the General information page
	@FLTAPS-1996
	Scenario: Verify that User can access the "Add Event" page from the "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)-SA
		When User hover over the Fleet
		And  User clicks the Vehicles button
		And  User clicks any vehiclerow under Fleet-Vehicle module
		Then User should be able to see the Add Event buton