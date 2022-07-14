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

a := Account new.

a printNl.

Account comment printNl.
