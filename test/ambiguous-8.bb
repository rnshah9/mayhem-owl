grammar = rule*
rule = identifier '=' body
body = expr | (expr ':' identifier)+ operators*
operators = '.operators' fixity operator+
operator = expr ':' identifier
fixity =
  'postfix' : postfix-op
  'prefix' : prefix-op
  'infix' assoc : infix-op
assoc =
  'flat' : flat-op
  'left' : left-op
  'right' : right-op
  'nonassoc' : nonassoc-op
expr =
  identifier ('@' identifier@rename)? : ident
  string : literal
  [ '(' expr [ '(' b* ')' ] ')' ] : parens
  [ '[' string@begin-token expr? string@end-token ']' ] : bracketed
 .operators postfix
  '*' : zero-or-more
  '+' : one-or-more
  '?' : optional
 .operators infix flat
  '' : concatenation
 .operators infix flat
  '|' : choice
b = ''
