program = decl*
decl =
  'function' identifier '(' ((identifier ',')+ identifier)? ')' '{' stmt* '}' : function
stmt = expr
expr =
  number : literal
 .operators prefix
  '-' : negate
 .operators infix flat
  '+' : plus
  '-' : minus
