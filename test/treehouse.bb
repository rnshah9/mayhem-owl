program = declaration*
declaration = 'match' [ '{' match* '}' ] 'do' [ '{' stmt* '}' ]
match =
 (identifier '=')? match-op index-path : op
 'where' expr : where
 'minimize' expr : min
 'maximize' expr : max
match-op =
 'read' : read
 'take' : take
 'put' : put
index-path = identifier
stmt = identifier
expr = identifier
