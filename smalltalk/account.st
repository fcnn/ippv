#!/opt/stk/bin/gst

"example program"

Object subclass: #Account.
Account instanceVariableNames: 'balance'.
Account comment: 'deposit and withdraw'.

Account extend [
        init [
                <category: 'initialization'>
                balance := 0
        ]
	spend: amount [
		<category: 'moving money'>
		balance := balance - amount
	]
	deposit: amount [
		<category: 'moving money'>
		balance := balance + amount
	]
]

Account class extend [
        new [
                | r |
                <category: 'instance creation'>
                r := super new.
                r init.
                ^r
        ]
]

Account comment printNl.

a := Account new.
a printNl.

a deposit 100.
a spend: 25 printNl.

