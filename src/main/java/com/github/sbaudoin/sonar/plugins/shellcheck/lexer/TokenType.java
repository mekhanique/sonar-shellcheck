/**
 * Copyright (c) 2018-2021, Sylvain Baudoin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.sbaudoin.sonar.plugins.shellcheck.lexer;

/**
 * Enumeration of known Bash token types
 */
public enum TokenType {
    SHEBANG,
    COMMENT,
    WHITESPACE,
    LINE_FEED,
    HEREDOC_MARKER_START,
    BAD_CHARACTER,
    HEREDOC_LINE,
    HEREDOC_CONTENT,
    HEREDOC_MARKER_IGNORING_TABS_END,
    HEREDOC_MARKER_END,
    VARIABLE,
    EXPR_CONDITIONAL,
    EXPR_CONDITIONAL_END,
    TIME_KEYWORD,
    AND_AND,
    OR_OR,
    LEFT_SQUARE,
    RIGHT_SQUARE,
    DOLLAR,
    LEFT_PAREN,
    RIGHT_PAREN,
    WORD,
    EXPR_ARITH,
    EXPR_ARITH_END,
    EXPR_ARITH_SQUARE,
    EXPR_ARITH_SQUARE_END,
    ASSIGNMENT_WORD,
    EQ,
    ADD_EQ,
    COMMA,
    CASE_KEYWORD,
    BANG_TOKEN,
    DO_KEYWORD,
    DONE_KEYWORD,
    ELIF_KEYWORD,
    ELSE_KEYWORD,
    FI_KEYWORD,
    FOR_KEYWORD,
    FUNCTION_KEYWORD,
    IF_KEYWORD,
    SELECT_KEYWORD,
    THEN_KEYWORD,
    UNTIL_KEYWORD,
    WHILE_KEYWORD,
    BRACKET_KEYWORD,
    BRACKET_KEYWORD_END,
    TRAP_KEYWORD,
    LET_KEYWORD,
    COND_OP_EQ_EQ,
    COND_OP_REGEX,
    COND_OP_NOT,
    COND_OP,
    ARITH_HEX_NUMBER,
    ARITH_OCTAL_NUMBER,
    ARITH_NUMBER,
    ARITH_GT,
    ARITH_LT,
    ARITH_GE,
    ARITH_LE,
    ARITH_NE,
    ARITH_SHIFT_LEFT,
    ARITH_SHIFT_RIGHT,
    ARITH_ASS_MUL,
    ARITH_ASS_DIV,
    ARITH_ASS_MOD,
    ARITH_ASS_PLUS,
    ARITH_ASS_MINUS,
    ARITH_ASS_SHIFT_RIGHT,
    ARITH_ASS_SHIFT_LEFT,
    ARITH_ASS_BIT_AND,
    ARITH_ASS_BIT_OR,
    ARITH_ASS_BIT_XOR,
    ARITH_PLUS,
    ARITH_PLUS_PLUS,
    ARITH_MINUS,
    ARITH_MINUS_MINUS,
    ARITH_EQ,
    ARITH_EXPONENT,
    ARITH_MULT,
    ARITH_DIV,
    ARITH_MOD,
    ARITH_NEGATE,
    ARITH_BITWISE_AND,
    ARITH_BITWISE_NEGATE,
    ARITH_BITWISE_XOR,
    ARITH_QMARK,
    ARITH_COLON,
    ARITH_BASE_CHAR,
    ESAC_KEYWORD,
    CASE_END,
    SEMI,
    STRING_BEGIN,
    STRING_END,
    BACKQUOTE,
    STRING_DATA,
    STRING_CONTENT,
    REDIRECT_AMP_GREATER,
    AMP,
    REDIRECT_HERE_STRING,
    REDIRECT_LESS_GREATER,
    REDIRECT_LESS_AMP,
    REDIRECT_GREATER_AMP,
    FILEDESCRIPTOR,
    PARAM_EXPANSION_OP_EXCL,
    PARAM_EXPANSION_OP_COLON_EQ,
    PARAM_EXPANSION_OP_EQ,
    PARAM_EXPANSION_OP_COLON_MINUS,
    PARAM_EXPANSION_OP_MINUS,
    PARAM_EXPANSION_OP_COLON_PLUS,
    PARAM_EXPANSION_OP_PLUS,
    PARAM_EXPANSION_OP_COLON_QMARK,
    PARAM_EXPANSION_OP_COLON,
    PARAM_EXPANSION_OP_SLASH_SLASH,
    PARAM_EXPANSION_OP_SLASH,
    PARAM_EXPANSION_OP_HASH_HASH,
    PARAM_EXPANSION_OP_HASH,
    PARAM_EXPANSION_OP_AT,
    PARAM_EXPANSION_OP_STAR,
    PARAM_EXPANSION_OP_PERCENT,
    PARAM_EXPANSION_OP_QMARK,
    PARAM_EXPANSION_OP_DOT,
    PARAM_EXPANSION_OP_UPPERCASE_FIRST,
    PARAM_EXPANSION_OP_UPPERCASE_ALL,
    PARAM_EXPANSION_OP_LOWERCASE_FIRST,
    PARAM_EXPANSION_OP_LOWERCASE_ALL,
    LEFT_CURLY,
    RIGHT_CURLY,
    PARAM_EXPANSION_PATTERN,
    LINE_CONTINUATION,
    STRING2,
    PIPE_AMP,
    PIPE,
    AT,
    HEREDOC_MARKER_TAG,
    GREATER_THAN,
    LESS_THAN,
    SHIFT_RIGHT,
    BACKSLASH,
    INTEGER_LITERAL,
    REDIRECT_AMP_GREATER_GREATER,
    REDIRECT_GREATER_BAR
}
