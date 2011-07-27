package org.apache.pigeditor.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPigLexer extends Lexer {
    public static final int RULE_ID=105;
    public static final int RULE_ANY_OTHER=109;
    public static final int KEYWORD_56=47;
    public static final int KEYWORD_55=46;
    public static final int KEYWORD_54=45;
    public static final int KEYWORD_53=44;
    public static final int KEYWORD_52=43;
    public static final int KEYWORD_51=42;
    public static final int KEYWORD_50=41;
    public static final int EOF=-1;
    public static final int KEYWORD_59=27;
    public static final int KEYWORD_58=26;
    public static final int KEYWORD_57=25;
    public static final int KEYWORD_65=33;
    public static final int KEYWORD_64=32;
    public static final int KEYWORD_67=35;
    public static final int KEYWORD_66=34;
    public static final int KEYWORD_61=29;
    public static final int KEYWORD_60=28;
    public static final int KEYWORD_63=31;
    public static final int KEYWORD_62=30;
    public static final int KEYWORD_69=37;
    public static final int KEYWORD_68=36;
    public static final int KEYWORD_30=65;
    public static final int KEYWORD_34=69;
    public static final int KEYWORD_33=68;
    public static final int KEYWORD_32=67;
    public static final int KEYWORD_31=66;
    public static final int KEYWORD_38=48;
    public static final int KEYWORD_37=72;
    public static final int KEYWORD_36=71;
    public static final int KEYWORD_35=70;
    public static final int RULE_LETTER=98;
    public static final int RULE_ML_COMMENT=107;
    public static final int RULE_COGROUP_TYPE=95;
    public static final int KEYWORD_39=49;
    public static final int RULE_STRING=106;
    public static final int KEYWORD_41=51;
    public static final int KEYWORD_40=50;
    public static final int KEYWORD_43=53;
    public static final int KEYWORD_42=52;
    public static final int KEYWORD_45=55;
    public static final int KEYWORD_44=54;
    public static final int KEYWORD_47=57;
    public static final int RULE_DIGIT=97;
    public static final int KEYWORD_46=56;
    public static final int KEYWORD_49=40;
    public static final int KEYWORD_48=39;
    public static final int RULE_LONGINTEGER=102;
    public static final int KEYWORD_90=6;
    public static final int KEYWORD_19=91;
    public static final int KEYWORD_17=89;
    public static final int KEYWORD_91=7;
    public static final int KEYWORD_18=90;
    public static final int KEYWORD_15=87;
    public static final int KEYWORD_16=88;
    public static final int KEYWORD_13=85;
    public static final int KEYWORD_14=86;
    public static final int KEYWORD_11=83;
    public static final int KEYWORD_12=84;
    public static final int KEYWORD_10=82;
    public static final int KEYWORD_6=78;
    public static final int KEYWORD_7=79;
    public static final int KEYWORD_8=80;
    public static final int KEYWORD_9=81;
    public static final int KEYWORD_28=63;
    public static final int KEYWORD_29=64;
    public static final int RULE_INT=101;
    public static final int KEYWORD_24=59;
    public static final int KEYWORD_25=60;
    public static final int KEYWORD_26=61;
    public static final int KEYWORD_27=62;
    public static final int KEYWORD_20=92;
    public static final int KEYWORD_21=93;
    public static final int KEYWORD_22=94;
    public static final int KEYWORD_23=58;
    public static final int KEYWORD_79=18;
    public static final int KEYWORD_71=20;
    public static final int RULE_EXECCOMMAND=104;
    public static final int KEYWORD_72=21;
    public static final int KEYWORD_73=22;
    public static final int KEYWORD_74=23;
    public static final int KEYWORD_75=24;
    public static final int KEYWORD_76=15;
    public static final int KEYWORD_77=16;
    public static final int KEYWORD_78=17;
    public static final int KEYWORD_1=73;
    public static final int RULE_DOUBLENUMBER=103;
    public static final int KEYWORD_5=77;
    public static final int KEYWORD_4=76;
    public static final int KEYWORD_70=38;
    public static final int KEYWORD_3=75;
    public static final int KEYWORD_2=74;
    public static final int RULE_FLOATINGPOINT=100;
    public static final int RULE_SL_COMMENT=96;
    public static final int KEYWORD_84=11;
    public static final int KEYWORD_85=12;
    public static final int KEYWORD_82=9;
    public static final int KEYWORD_83=10;
    public static final int KEYWORD_88=4;
    public static final int KEYWORD_89=5;
    public static final int KEYWORD_86=13;
    public static final int KEYWORD_87=14;
    public static final int KEYWORD_81=8;
    public static final int RULE_SPECIALCHAR=99;
    public static final int KEYWORD_80=19;
    public static final int RULE_WS=108;

    // delegates
    // delegators

    public InternalPigLexer() {;} 
    public InternalPigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g"; }

    // $ANTLR start "KEYWORD_88"
    public final void mKEYWORD_88() throws RecognitionException {
        try {
            int _type = KEYWORD_88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:19:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:19:14: ( 'B' | 'b' ) ( 'Y' | 'y' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_88"

    // $ANTLR start "KEYWORD_89"
    public final void mKEYWORD_89() throws RecognitionException {
        try {
            int _type = KEYWORD_89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:21:12: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:21:14: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_89"

    // $ANTLR start "KEYWORD_90"
    public final void mKEYWORD_90() throws RecognitionException {
        try {
            int _type = KEYWORD_90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:23:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:23:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_90"

    // $ANTLR start "KEYWORD_91"
    public final void mKEYWORD_91() throws RecognitionException {
        try {
            int _type = KEYWORD_91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:25:12: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:25:14: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_91"

    // $ANTLR start "KEYWORD_81"
    public final void mKEYWORD_81() throws RecognitionException {
        try {
            int _type = KEYWORD_81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:27:12: ( '%' ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:27:14: '%' ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            match('%'); 
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_81"

    // $ANTLR start "KEYWORD_82"
    public final void mKEYWORD_82() throws RecognitionException {
        try {
            int _type = KEYWORD_82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:29:12: ( '%' ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:29:14: '%' ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            match('%'); 
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_82"

    // $ANTLR start "KEYWORD_83"
    public final void mKEYWORD_83() throws RecognitionException {
        try {
            int _type = KEYWORD_83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:31:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:31:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_83"

    // $ANTLR start "KEYWORD_84"
    public final void mKEYWORD_84() throws RecognitionException {
        try {
            int _type = KEYWORD_84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:33:12: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:33:14: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_84"

    // $ANTLR start "KEYWORD_85"
    public final void mKEYWORD_85() throws RecognitionException {
        try {
            int _type = KEYWORD_85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:35:12: ( ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:35:14: ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_85"

    // $ANTLR start "KEYWORD_86"
    public final void mKEYWORD_86() throws RecognitionException {
        try {
            int _type = KEYWORD_86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:37:12: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'L' | 'l' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:37:14: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_86"

    // $ANTLR start "KEYWORD_87"
    public final void mKEYWORD_87() throws RecognitionException {
        try {
            int _type = KEYWORD_87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:39:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:39:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_87"

    // $ANTLR start "KEYWORD_76"
    public final void mKEYWORD_76() throws RecognitionException {
        try {
            int _type = KEYWORD_76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:41:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:41:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_76"

    // $ANTLR start "KEYWORD_77"
    public final void mKEYWORD_77() throws RecognitionException {
        try {
            int _type = KEYWORD_77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:43:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:43:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_77"

    // $ANTLR start "KEYWORD_78"
    public final void mKEYWORD_78() throws RecognitionException {
        try {
            int _type = KEYWORD_78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:45:12: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:45:14: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_78"

    // $ANTLR start "KEYWORD_79"
    public final void mKEYWORD_79() throws RecognitionException {
        try {
            int _type = KEYWORD_79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:47:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:47:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_79"

    // $ANTLR start "KEYWORD_80"
    public final void mKEYWORD_80() throws RecognitionException {
        try {
            int _type = KEYWORD_80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:49:12: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'G' | 'g' ) ( 'H' | 'h' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:49:14: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'G' | 'g' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_80"

    // $ANTLR start "KEYWORD_71"
    public final void mKEYWORD_71() throws RecognitionException {
        try {
            int _type = KEYWORD_71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:51:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:51:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_71"

    // $ANTLR start "KEYWORD_72"
    public final void mKEYWORD_72() throws RecognitionException {
        try {
            int _type = KEYWORD_72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:53:12: ( ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:53:14: ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_72"

    // $ANTLR start "KEYWORD_73"
    public final void mKEYWORD_73() throws RecognitionException {
        try {
            int _type = KEYWORD_73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:55:12: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:55:14: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_73"

    // $ANTLR start "KEYWORD_74"
    public final void mKEYWORD_74() throws RecognitionException {
        try {
            int _type = KEYWORD_74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:57:12: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:57:14: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_74"

    // $ANTLR start "KEYWORD_75"
    public final void mKEYWORD_75() throws RecognitionException {
        try {
            int _type = KEYWORD_75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:59:12: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'M' | 'm' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:59:14: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_75"

    // $ANTLR start "KEYWORD_57"
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:61:12: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:61:14: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_57"

    // $ANTLR start "KEYWORD_58"
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:63:12: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:63:14: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_58"

    // $ANTLR start "KEYWORD_59"
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:65:12: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:65:14: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_59"

    // $ANTLR start "KEYWORD_60"
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:67:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:67:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_60"

    // $ANTLR start "KEYWORD_61"
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:69:12: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:69:14: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_61"

    // $ANTLR start "KEYWORD_62"
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:71:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'P' | 'p' ) '[' ']' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:71:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'P' | 'p' ) '[' ']'
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('['); 
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_62"

    // $ANTLR start "KEYWORD_63"
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:73:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:73:14: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_63"

    // $ANTLR start "KEYWORD_64"
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:75:12: ( ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:75:14: ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_64"

    // $ANTLR start "KEYWORD_65"
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:77:12: ( ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'H' | 'h' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:77:14: ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'H' | 'h' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_65"

    // $ANTLR start "KEYWORD_66"
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:79:12: ( ( 'S' | 's' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:79:14: ( 'S' | 's' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_66"

    // $ANTLR start "KEYWORD_67"
    public final void mKEYWORD_67() throws RecognitionException {
        try {
            int _type = KEYWORD_67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:81:12: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:81:14: ( 'S' | 's' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_67"

    // $ANTLR start "KEYWORD_68"
    public final void mKEYWORD_68() throws RecognitionException {
        try {
            int _type = KEYWORD_68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:83:12: ( ( 'T' | 't' ) ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:83:14: ( 'T' | 't' ) ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_68"

    // $ANTLR start "KEYWORD_69"
    public final void mKEYWORD_69() throws RecognitionException {
        try {
            int _type = KEYWORD_69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:85:12: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:85:14: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_69"

    // $ANTLR start "KEYWORD_70"
    public final void mKEYWORD_70() throws RecognitionException {
        try {
            int _type = KEYWORD_70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:87:12: ( ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:87:14: ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_70"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:89:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:89:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:91:12: ( ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:91:14: ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:93:12: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:93:14: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:95:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:95:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:97:12: ( ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:97:14: ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_53"
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:99:12: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:99:14: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_53"

    // $ANTLR start "KEYWORD_54"
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:101:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:101:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_54"

    // $ANTLR start "KEYWORD_55"
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:103:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:103:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_55"

    // $ANTLR start "KEYWORD_56"
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:105:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:105:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_56"

    // $ANTLR start "KEYWORD_38"
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:107:12: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:107:14: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:109:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:109:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:111:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:111:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:113:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:113:14: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:115:12: ( ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:115:14: ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:117:12: ( ( 'G' | 'g' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:117:14: ( 'G' | 'g' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_43"

    // $ANTLR start "KEYWORD_44"
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:119:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:119:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:121:12: ( ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:121:14: ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:123:12: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:123:14: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'Q' | 'q' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_47"
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:125:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:125:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:127:12: ( '!' '=' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:127:14: '!' '='
            {
            match('!'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:129:12: ( ':' ':' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:129:14: ':' ':'
            {
            match(':'); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:131:12: ( '<' '=' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:131:14: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:133:12: ( '=' '=' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:133:14: '=' '='
            {
            match('='); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:135:12: ( '>' '=' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:135:14: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:137:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:137:14: ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:139:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:139:14: ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:141:12: ( ( 'E' | 'e' ) ( 'Q' | 'q' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:141:14: ( 'E' | 'e' ) ( 'Q' | 'q' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:143:12: ( ( 'G' | 'g' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:143:14: ( 'G' | 'g' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:145:12: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:145:14: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:147:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:147:14: ( 'I' | 'i' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:149:12: ( ( 'L' | 'l' ) ( 'T' | 't' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:149:14: ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:151:12: ( ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:151:14: ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:153:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:153:14: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:155:12: ( '\\\\' ( 'U' | 'u' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:155:14: '\\\\' ( 'U' | 'u' )
            {
            match('\\'); 
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_37"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:157:11: ( '#' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:157:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:159:11: ( '$' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:159:13: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:161:11: ( '%' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:161:13: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:163:11: ( '(' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:163:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:165:11: ( ')' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:165:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:167:11: ( '*' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:167:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:169:11: ( '+' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:169:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:171:11: ( ',' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:171:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:173:11: ( '-' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:173:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:175:12: ( '.' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:175:14: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:177:12: ( '/' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:177:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:179:12: ( ':' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:179:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:181:12: ( ';' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:181:14: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:183:12: ( '<' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:183:14: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:185:12: ( '=' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:185:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:187:12: ( '>' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:187:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:189:12: ( '?' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:189:14: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:191:12: ( '[' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:191:14: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:193:12: ( '\\\\' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:193:14: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:195:12: ( ']' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:195:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:197:12: ( '{' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:197:14: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_21"

    // $ANTLR start "KEYWORD_22"
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:199:12: ( '}' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:199:14: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "RULE_COGROUP_TYPE"
    public final void mRULE_COGROUP_TYPE() throws RecognitionException {
        try {
            int _type = RULE_COGROUP_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:203:19: ( '\\'' 'merge' '\\'' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:203:21: '\\'' 'merge' '\\''
            {
            match('\''); 
            match("merge"); 

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COGROUP_TYPE"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:205:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:205:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:205:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:205:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:205:40: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:205:41: ( '\\r' )? '\\n'
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:205:41: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:205:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:207:12: ( '0' .. '9' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:207:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:209:13: ( 'A' .. 'Z' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:209:15: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_SPECIALCHAR"
    public final void mRULE_SPECIALCHAR() throws RecognitionException {
        try {
            int _type = RULE_SPECIALCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:211:18: ( '_' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:211:20: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECIALCHAR"

    // $ANTLR start "RULE_FLOATINGPOINT"
    public final void mRULE_FLOATINGPOINT() throws RecognitionException {
        try {
            int _type = RULE_FLOATINGPOINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:213:20: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:213:22: ( RULE_DIGIT )+ '.' ( RULE_DIGIT )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:213:22: ( RULE_DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:213:22: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('.'); 
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:213:38: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:213:38: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATINGPOINT"

    // $ANTLR start "RULE_LONGINTEGER"
    public final void mRULE_LONGINTEGER() throws RecognitionException {
        try {
            int _type = RULE_LONGINTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:215:18: ( RULE_INT 'L' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:215:20: RULE_INT 'L'
            {
            mRULE_INT(); 
            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONGINTEGER"

    // $ANTLR start "RULE_DOUBLENUMBER"
    public final void mRULE_DOUBLENUMBER() throws RecognitionException {
        try {
            int _type = RULE_DOUBLENUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:217:19: ( RULE_FLOATINGPOINT ( 'E' ( '-' | '+' )? RULE_INT )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:217:21: RULE_FLOATINGPOINT ( 'E' ( '-' | '+' )? RULE_INT )?
            {
            mRULE_FLOATINGPOINT(); 
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:217:40: ( 'E' ( '-' | '+' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:217:41: 'E' ( '-' | '+' )? RULE_INT
                    {
                    match('E'); 
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:217:45: ( '-' | '+' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLENUMBER"

    // $ANTLR start "RULE_EXECCOMMAND"
    public final void mRULE_EXECCOMMAND() throws RecognitionException {
        try {
            int _type = RULE_EXECCOMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:219:18: ( '`' (~ ( '`' ) )* '`' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:219:20: '`' (~ ( '`' ) )* '`'
            {
            match('`'); 
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:219:24: (~ ( '`' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='_')||(LA8_0>='a' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:219:24: ~ ( '`' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXECCOMMAND"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:221:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:221:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:221:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:221:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:221:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:223:10: ( ( '0' .. '9' )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:223:12: ( '0' .. '9' )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:223:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:223:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:225:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:227:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:227:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:227:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:227:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:229:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:229:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:229:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:231:16: ( . )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:231:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:8: ( KEYWORD_88 | KEYWORD_89 | KEYWORD_90 | KEYWORD_91 | KEYWORD_81 | KEYWORD_82 | KEYWORD_83 | KEYWORD_84 | KEYWORD_85 | KEYWORD_86 | KEYWORD_87 | KEYWORD_76 | KEYWORD_77 | KEYWORD_78 | KEYWORD_79 | KEYWORD_80 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_74 | KEYWORD_75 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_70 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | RULE_COGROUP_TYPE | RULE_SL_COMMENT | RULE_DIGIT | RULE_LETTER | RULE_SPECIALCHAR | RULE_FLOATINGPOINT | RULE_LONGINTEGER | RULE_DOUBLENUMBER | RULE_EXECCOMMAND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=106;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:10: KEYWORD_88
                {
                mKEYWORD_88(); 

                }
                break;
            case 2 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:21: KEYWORD_89
                {
                mKEYWORD_89(); 

                }
                break;
            case 3 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:32: KEYWORD_90
                {
                mKEYWORD_90(); 

                }
                break;
            case 4 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:43: KEYWORD_91
                {
                mKEYWORD_91(); 

                }
                break;
            case 5 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:54: KEYWORD_81
                {
                mKEYWORD_81(); 

                }
                break;
            case 6 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:65: KEYWORD_82
                {
                mKEYWORD_82(); 

                }
                break;
            case 7 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:76: KEYWORD_83
                {
                mKEYWORD_83(); 

                }
                break;
            case 8 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:87: KEYWORD_84
                {
                mKEYWORD_84(); 

                }
                break;
            case 9 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:98: KEYWORD_85
                {
                mKEYWORD_85(); 

                }
                break;
            case 10 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:109: KEYWORD_86
                {
                mKEYWORD_86(); 

                }
                break;
            case 11 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:120: KEYWORD_87
                {
                mKEYWORD_87(); 

                }
                break;
            case 12 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:131: KEYWORD_76
                {
                mKEYWORD_76(); 

                }
                break;
            case 13 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:142: KEYWORD_77
                {
                mKEYWORD_77(); 

                }
                break;
            case 14 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:153: KEYWORD_78
                {
                mKEYWORD_78(); 

                }
                break;
            case 15 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:164: KEYWORD_79
                {
                mKEYWORD_79(); 

                }
                break;
            case 16 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:175: KEYWORD_80
                {
                mKEYWORD_80(); 

                }
                break;
            case 17 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:186: KEYWORD_71
                {
                mKEYWORD_71(); 

                }
                break;
            case 18 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:197: KEYWORD_72
                {
                mKEYWORD_72(); 

                }
                break;
            case 19 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:208: KEYWORD_73
                {
                mKEYWORD_73(); 

                }
                break;
            case 20 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:219: KEYWORD_74
                {
                mKEYWORD_74(); 

                }
                break;
            case 21 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:230: KEYWORD_75
                {
                mKEYWORD_75(); 

                }
                break;
            case 22 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:241: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 23 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:252: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 24 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:263: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 25 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:274: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 26 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:285: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 27 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:296: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 28 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:307: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 29 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:318: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 30 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:329: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 31 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:340: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 32 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:351: KEYWORD_67
                {
                mKEYWORD_67(); 

                }
                break;
            case 33 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:362: KEYWORD_68
                {
                mKEYWORD_68(); 

                }
                break;
            case 34 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:373: KEYWORD_69
                {
                mKEYWORD_69(); 

                }
                break;
            case 35 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:384: KEYWORD_70
                {
                mKEYWORD_70(); 

                }
                break;
            case 36 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:395: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 37 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:406: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 38 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:417: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 39 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:428: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 40 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:439: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 41 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:450: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 42 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:461: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 43 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:472: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 44 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:483: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 45 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:494: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 46 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:505: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 47 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:516: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 48 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:527: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 49 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:538: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 50 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:549: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 51 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:560: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 52 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:571: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 53 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:582: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 54 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:593: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 55 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:604: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 56 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:615: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 57 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:626: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 58 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:637: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 59 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:648: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 60 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:659: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 61 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:670: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 62 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:681: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 63 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:692: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 64 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:703: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 65 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:714: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 66 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:725: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 67 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:736: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 68 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:747: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 69 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:758: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 70 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:769: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 71 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:779: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 72 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:789: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 73 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:799: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 74 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:809: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 75 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:819: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 76 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:829: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 77 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:839: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 78 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:849: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 79 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:859: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 80 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:870: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 81 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:881: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 82 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:892: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 83 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:903: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 84 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:914: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 85 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:925: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 86 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:936: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 87 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:947: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 88 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:958: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 89 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:969: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 90 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:980: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 91 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:991: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 92 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1002: RULE_COGROUP_TYPE
                {
                mRULE_COGROUP_TYPE(); 

                }
                break;
            case 93 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1020: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 94 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1036: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 95 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1047: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 96 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1059: RULE_SPECIALCHAR
                {
                mRULE_SPECIALCHAR(); 

                }
                break;
            case 97 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1076: RULE_FLOATINGPOINT
                {
                mRULE_FLOATINGPOINT(); 

                }
                break;
            case 98 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1095: RULE_LONGINTEGER
                {
                mRULE_LONGINTEGER(); 

                }
                break;
            case 99 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1112: RULE_DOUBLENUMBER
                {
                mRULE_DOUBLENUMBER(); 

                }
                break;
            case 100 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1130: RULE_EXECCOMMAND
                {
                mRULE_EXECCOMMAND(); 

                }
                break;
            case 101 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1147: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 102 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1155: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 103 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1164: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 104 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1176: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 105 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1192: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 106 :
                // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/lexer/InternalPigLexer.g:1:1200: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\4\110\1\120\16\110\1\105\1\172\1\174\1\176\1\u0080\1\u0082"+
        "\7\uffff\1\u008b\1\uffff\1\u008e\6\uffff\1\105\1\u0097\22\111\1"+
        "\110\1\u009b\2\105\1\uffff\1\105\2\uffff\1\u009f\1\111\2\uffff\5"+
        "\111\2\uffff\6\111\1\u00b0\3\111\1\u00b4\12\111\1\u00c1\1\u00c2"+
        "\3\111\1\u00c8\1\u00ca\1\111\1\u00cc\10\111\1\u00d7\41\uffff\1\u00d9"+
        "\4\uffff\1\111\1\uffff\1\u00dc\6\111\1\uffff\7\111\1\u00ee\1\uffff"+
        "\3\111\1\uffff\13\111\1\u00fe\2\uffff\4\111\1\u0103\1\uffff\1\111"+
        "\1\uffff\1\111\1\uffff\4\111\1\u010a\1\u010b\1\u010c\1\u010d\1\u010e"+
        "\1\u010f\3\uffff\1\u0111\1\111\1\uffff\4\111\1\uffff\3\111\2\uffff"+
        "\1\u011c\3\111\1\u0120\2\111\1\uffff\6\111\1\u0129\7\111\1\u0131"+
        "\1\uffff\1\111\1\u0133\1\u0134\1\u0135\1\uffff\4\111\1\u013a\1\u013b"+
        "\11\uffff\3\111\1\u0140\5\111\1\uffff\3\111\1\uffff\1\111\1\u014a"+
        "\1\111\1\u014c\3\111\1\u0150\1\uffff\1\111\1\u0152\2\111\1\u0155"+
        "\1\u0156\1\u0157\1\uffff\1\u0158\3\uffff\1\u0159\1\u015a\1\u015b"+
        "\1\u015c\3\uffff\3\111\1\uffff\5\111\1\u0166\1\111\1\u0168\1\111"+
        "\1\uffff\1\111\1\uffff\2\111\1\u016d\1\uffff\1\111\1\uffff\1\u016f"+
        "\1\u0170\11\uffff\2\111\1\u0174\1\111\1\u0176\3\111\1\uffff\1\111"+
        "\1\uffff\2\111\1\u017d\1\u017e\1\uffff\1\u017f\3\uffff\2\111\1\uffff"+
        "\1\111\1\uffff\1\111\1\u0185\1\u0186\1\u0187\1\u0188\1\u0189\4\uffff"+
        "\1\u018a\1\u018b\1\u018c\1\u018d\11\uffff";
    static final String DFA17_eofS =
        "\u018e\uffff";
    static final String DFA17_minS =
        "\1\0\4\60\1\104\16\60\1\75\1\72\3\75\1\125\7\uffff\1\55\1\uffff"+
        "\1\52\6\uffff\1\0\1\56\1\101\1\110\2\101\3\105\1\121\1\111\1\110"+
        "\1\101\1\106\1\105\2\116\1\117\1\105\1\114\2\60\1\0\1\101\1\uffff"+
        "\1\0\2\uffff\1\60\1\107\2\uffff\1\101\1\107\1\117\1\120\1\122\1"+
        "\105\1\uffff\1\106\1\123\1\125\1\115\1\116\1\117\1\60\2\107\1\120"+
        "\1\60\1\122\1\114\1\117\1\114\1\122\1\120\1\115\1\117\1\114\1\116"+
        "\2\60\1\115\1\106\1\101\2\60\1\124\1\60\3\111\1\114\1\121\1\124"+
        "\1\114\1\104\1\60\35\uffff\1\0\3\uffff\1\56\1\60\3\uffff\1\105\1"+
        "\uffff\1\60\2\122\1\123\1\122\1\103\1\101\2\103\1\111\1\124\1\102"+
        "\1\120\1\105\1\125\1\60\1\uffff\1\111\1\110\1\114\1\uffff\1\105"+
        "\1\124\1\101\1\114\1\117\1\114\1\120\1\105\1\122\1\111\1\105\1\60"+
        "\2\uffff\1\111\1\124\1\104\1\107\1\60\1\uffff\1\105\1\uffff\1\105"+
        "\1\uffff\1\117\2\116\1\114\6\60\1\uffff\1\0\1\uffff\1\60\1\101\1"+
        "\uffff\1\101\1\117\1\123\1\105\1\uffff\1\110\1\111\1\114\2\uffff"+
        "\1\60\1\116\1\111\1\114\1\60\1\122\1\120\1\uffff\1\123\1\124\2\101"+
        "\1\105\1\124\1\60\1\125\1\105\1\114\1\101\1\105\1\124\1\122\1\60"+
        "\1\uffff\1\124\3\60\1\uffff\2\122\1\116\1\107\2\60\6\uffff\1\0\2"+
        "\uffff\2\122\1\125\1\60\1\104\1\105\1\124\1\114\1\111\1\uffff\1"+
        "\105\1\116\1\105\1\uffff\1\101\1\60\1\124\1\60\1\111\1\103\1\122"+
        "\1\60\1\uffff\1\107\1\60\1\105\1\115\3\60\1\uffff\1\60\3\uffff\4"+
        "\60\2\uffff\1\0\2\122\1\120\1\uffff\1\125\1\123\1\111\1\105\1\102"+
        "\1\60\1\103\1\60\1\124\1\uffff\1\105\1\uffff\1\116\1\110\1\60\1"+
        "\uffff\1\110\1\uffff\2\60\10\uffff\1\0\2\101\1\60\1\103\1\60\1\117"+
        "\1\114\1\105\1\uffff\1\124\1\uffff\1\105\1\122\2\60\1\uffff\1\60"+
        "\3\uffff\2\131\1\uffff\1\105\1\uffff\1\116\5\60\4\uffff\4\60\11"+
        "\uffff";
    static final String DFA17_maxS =
        "\1\uffff\4\172\1\144\16\172\1\75\1\72\3\75\1\165\7\uffff\1\55\1"+
        "\uffff\1\52\6\uffff\1\uffff\1\114\1\171\1\162\2\141\1\165\1\164"+
        "\1\151\1\170\2\165\1\164\1\163\1\164\1\165\1\163\1\157\1\165\1\163"+
        "\2\172\1\uffff\1\172\1\uffff\1\uffff\2\uffff\1\172\1\147\2\uffff"+
        "\1\141\1\147\1\157\1\164\1\162\1\145\1\uffff\2\163\1\165\1\155\1"+
        "\156\1\157\1\172\2\147\1\160\1\172\1\162\1\154\1\157\1\154\1\162"+
        "\1\160\1\155\1\162\1\154\1\164\2\172\1\155\1\146\1\156\2\172\1\164"+
        "\1\172\3\151\1\154\1\161\1\164\1\154\1\171\1\172\35\uffff\1\uffff"+
        "\3\uffff\1\114\1\71\3\uffff\1\145\1\uffff\1\172\2\162\1\163\1\162"+
        "\1\143\1\164\1\146\1\143\1\151\1\164\1\142\1\160\1\145\1\165\1\172"+
        "\1\uffff\1\151\1\150\1\154\1\uffff\1\145\1\164\1\141\1\154\1\157"+
        "\1\154\1\160\1\145\1\162\1\151\1\145\1\172\2\uffff\1\151\1\164\1"+
        "\144\1\147\1\172\1\uffff\1\145\1\uffff\1\145\1\uffff\1\157\2\156"+
        "\1\154\6\172\1\uffff\1\uffff\1\uffff\1\105\1\141\1\uffff\1\141\1"+
        "\157\1\163\1\145\1\uffff\1\150\1\151\1\154\2\uffff\1\172\1\156\1"+
        "\151\1\154\1\172\1\162\1\160\1\uffff\1\163\1\164\2\141\1\145\1\164"+
        "\1\172\1\165\1\145\1\154\1\141\1\145\1\164\1\162\1\172\1\uffff\1"+
        "\164\3\172\1\uffff\2\162\1\156\1\147\2\172\6\uffff\1\uffff\2\uffff"+
        "\2\162\1\165\1\172\1\144\1\145\1\164\1\154\1\151\1\uffff\1\145\1"+
        "\156\1\145\1\uffff\1\141\1\172\1\164\1\172\1\151\1\143\1\162\1\172"+
        "\1\uffff\1\147\1\172\1\145\1\155\3\172\1\uffff\1\172\3\uffff\4\172"+
        "\2\uffff\1\uffff\2\162\1\160\1\uffff\1\165\1\163\1\151\1\145\1\142"+
        "\1\172\1\143\1\172\1\164\1\uffff\1\145\1\uffff\1\156\1\150\1\172"+
        "\1\uffff\1\150\1\uffff\2\172\10\uffff\1\uffff\2\141\1\172\1\143"+
        "\1\172\1\157\1\154\1\145\1\uffff\1\164\1\uffff\1\145\1\162\2\172"+
        "\1\uffff\1\172\3\uffff\2\171\1\uffff\1\145\1\uffff\1\156\5\172\4"+
        "\uffff\4\172\11\uffff";
    static final String DFA17_acceptS =
        "\32\uffff\1\106\1\107\1\111\1\112\1\113\1\114\1\115\1\uffff\1\117"+
        "\1\uffff\1\122\1\126\1\127\1\131\1\132\1\133\30\uffff\1\145\1\uffff"+
        "\1\151\1\152\2\uffff\1\137\1\145\6\uffff\1\110\47\uffff\1\67\1\70"+
        "\1\121\1\71\1\123\1\72\1\124\1\73\1\125\1\105\1\130\1\106\1\107"+
        "\1\111\1\112\1\113\1\114\1\115\1\135\1\116\1\117\1\150\1\120\1\122"+
        "\1\126\1\127\1\131\1\132\1\133\1\uffff\1\147\1\136\1\142\2\uffff"+
        "\1\140\1\144\1\151\1\uffff\1\75\20\uffff\1\77\3\uffff\1\76\14\uffff"+
        "\1\100\1\101\5\uffff\1\102\1\uffff\1\104\1\uffff\1\103\12\uffff"+
        "\1\74\1\uffff\1\146\2\uffff\1\61\4\uffff\1\33\3\uffff\1\5\1\6\7"+
        "\uffff\1\62\17\uffff\1\63\4\uffff\1\64\6\uffff\1\65\1\66\1\55\1"+
        "\56\1\57\1\60\1\uffff\1\141\1\143\11\uffff\1\44\3\uffff\1\45\10"+
        "\uffff\1\46\7\uffff\1\47\1\uffff\1\51\1\52\1\53\4\uffff\1\50\1\54"+
        "\4\uffff\1\26\11\uffff\1\30\1\uffff\1\36\3\uffff\1\27\1\uffff\1"+
        "\41\2\uffff\1\40\1\37\1\31\1\32\1\34\1\35\1\42\1\43\11\uffff\1\21"+
        "\1\uffff\1\22\4\uffff\1\23\1\uffff\1\24\1\25\1\134\2\uffff\1\14"+
        "\1\uffff\1\17\6\uffff\1\15\1\16\1\20\1\134\4\uffff\1\12\1\7\1\10"+
        "\1\11\1\13\1\1\1\2\1\3\1\4";
    static final String DFA17_specialS =
        "\1\7\51\uffff\1\6\25\uffff\1\2\2\uffff\1\10\121\uffff\1\3\102\uffff"+
        "\1\4\67\uffff\1\5\53\uffff\1\0\40\uffff\1\1\60\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\105\2\104\2\105\1\104\22\105\1\104\1\24\1\103\1\32\1\33"+
            "\1\5\1\105\1\52\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\12\53"+
            "\1\25\1\44\1\26\1\27\1\30\1\45\1\105\1\23\1\1\1\2\1\6\1\11\1"+
            "\12\1\7\1\76\1\15\1\21\1\76\1\16\1\3\1\22\1\17\1\4\1\76\1\10"+
            "\1\14\1\13\1\20\5\76\1\46\1\31\1\47\1\101\1\77\1\100\1\75\1"+
            "\54\1\55\1\60\1\63\1\64\1\61\1\102\1\67\1\73\1\102\1\70\1\56"+
            "\1\74\1\71\1\57\1\102\1\62\1\66\1\65\1\72\5\102\1\50\1\105\1"+
            "\51\uff82\105",
            "\12\111\7\uffff\1\107\27\111\1\106\1\111\4\uffff\1\111\1\uffff"+
            "\1\107\27\111\1\106\1\111",
            "\12\111\7\uffff\7\111\1\112\6\111\1\113\2\111\1\114\10\111"+
            "\4\uffff\1\111\1\uffff\7\111\1\112\6\111\1\113\2\111\1\114\10"+
            "\111",
            "\12\111\7\uffff\1\115\31\111\4\uffff\1\111\1\uffff\1\115\31"+
            "\111",
            "\12\111\7\uffff\1\116\31\111\4\uffff\1\111\1\uffff\1\116\31"+
            "\111",
            "\1\117\37\uffff\1\117",
            "\12\111\7\uffff\4\111\1\121\3\111\1\122\5\111\1\123\5\111\1"+
            "\124\5\111\4\uffff\1\111\1\uffff\4\111\1\121\3\111\1\122\5\111"+
            "\1\123\5\111\1\124\5\111",
            "\12\111\7\uffff\4\111\1\125\14\111\1\126\1\111\1\127\6\111"+
            "\4\uffff\1\111\1\uffff\4\111\1\125\14\111\1\126\1\111\1\127"+
            "\6\111",
            "\12\111\7\uffff\4\111\1\130\3\111\1\131\21\111\4\uffff\1\111"+
            "\1\uffff\4\111\1\130\3\111\1\131\21\111",
            "\12\111\7\uffff\20\111\1\133\6\111\1\132\2\111\4\uffff\1\111"+
            "\1\uffff\20\111\1\133\6\111\1\132\2\111",
            "\12\111\7\uffff\10\111\1\135\2\111\1\136\2\111\1\134\5\111"+
            "\1\137\5\111\4\uffff\1\111\1\uffff\10\111\1\135\2\111\1\136"+
            "\2\111\1\134\5\111\1\137\5\111",
            "\12\111\7\uffff\7\111\1\140\14\111\1\141\5\111\4\uffff\1\111"+
            "\1\uffff\7\111\1\140\14\111\1\141\5\111",
            "\12\111\7\uffff\1\142\16\111\1\144\3\111\1\143\6\111\4\uffff"+
            "\1\111\1\uffff\1\142\16\111\1\144\3\111\1\143\6\111",
            "\12\111\7\uffff\5\111\1\146\7\111\1\145\4\111\1\147\7\111\4"+
            "\uffff\1\111\1\uffff\5\111\1\146\7\111\1\145\4\111\1\147\7\111",
            "\12\111\7\uffff\4\111\1\151\3\111\1\150\5\111\1\152\4\111\1"+
            "\153\6\111\4\uffff\1\111\1\uffff\4\111\1\151\3\111\1\150\5\111"+
            "\1\152\4\111\1\153\6\111",
            "\12\111\7\uffff\15\111\1\156\3\111\1\154\2\111\1\155\5\111"+
            "\4\uffff\1\111\1\uffff\15\111\1\156\3\111\1\154\2\111\1\155"+
            "\5\111",
            "\12\111\7\uffff\15\111\1\157\4\111\1\160\7\111\4\uffff\1\111"+
            "\1\uffff\15\111\1\157\4\111\1\160\7\111",
            "\12\111\7\uffff\16\111\1\161\13\111\4\uffff\1\111\1\uffff\16"+
            "\111\1\161\13\111",
            "\12\111\7\uffff\4\111\1\163\11\111\1\164\5\111\1\162\5\111"+
            "\4\uffff\1\111\1\uffff\4\111\1\163\11\111\1\164\5\111\1\162"+
            "\5\111",
            "\12\111\7\uffff\13\111\1\165\1\111\1\166\4\111\1\167\7\111"+
            "\4\uffff\1\111\1\uffff\13\111\1\165\1\111\1\166\4\111\1\167"+
            "\7\111",
            "\1\170",
            "\1\171",
            "\1\173",
            "\1\175",
            "\1\177",
            "\1\u0081\37\uffff\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a",
            "",
            "\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\155\u0096\1\u0095\uff92\u0096",
            "\1\u009a\1\uffff\12\u0099\22\uffff\1\u0098",
            "\1\107\27\uffff\1\106\7\uffff\1\107\27\uffff\1\106",
            "\1\112\6\uffff\1\113\2\uffff\1\114\25\uffff\1\112\6\uffff\1"+
            "\113\2\uffff\1\114",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "\1\121\3\uffff\1\122\5\uffff\1\123\5\uffff\1\124\17\uffff\1"+
            "\121\3\uffff\1\122\5\uffff\1\123\5\uffff\1\124",
            "\1\125\14\uffff\1\126\1\uffff\1\127\20\uffff\1\125\14\uffff"+
            "\1\126\1\uffff\1\127",
            "\1\130\3\uffff\1\131\33\uffff\1\130\3\uffff\1\131",
            "\1\133\6\uffff\1\132\30\uffff\1\133\6\uffff\1\132",
            "\1\135\2\uffff\1\136\2\uffff\1\134\5\uffff\1\137\23\uffff\1"+
            "\135\2\uffff\1\136\2\uffff\1\134\5\uffff\1\137",
            "\1\140\14\uffff\1\141\22\uffff\1\140\14\uffff\1\141",
            "\1\142\16\uffff\1\144\3\uffff\1\143\14\uffff\1\142\16\uffff"+
            "\1\144\3\uffff\1\143",
            "\1\146\7\uffff\1\145\4\uffff\1\147\22\uffff\1\146\7\uffff\1"+
            "\145\4\uffff\1\147",
            "\1\151\3\uffff\1\150\5\uffff\1\152\4\uffff\1\153\20\uffff\1"+
            "\151\3\uffff\1\150\5\uffff\1\152\4\uffff\1\153",
            "\1\156\3\uffff\1\154\2\uffff\1\155\30\uffff\1\156\3\uffff\1"+
            "\154\2\uffff\1\155",
            "\1\157\4\uffff\1\160\32\uffff\1\157\4\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\1\163\11\uffff\1\164\5\uffff\1\162\17\uffff\1\163\11\uffff"+
            "\1\164\5\uffff\1\162",
            "\1\165\1\uffff\1\166\4\uffff\1\167\30\uffff\1\165\1\uffff\1"+
            "\166\4\uffff\1\167",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\0\u009c",
            "\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\0\u0096",
            "",
            "",
            "\12\111\7\uffff\23\111\1\u009e\6\111\4\uffff\1\111\1\uffff"+
            "\23\111\1\u009e\6\111",
            "\1\u00a0\37\uffff\1\u00a0",
            "",
            "",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\3\uffff\1\u00a5\33\uffff\1\u00a4\3\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "",
            "\1\u00a9\14\uffff\1\u00a8\22\uffff\1\u00a9\14\uffff\1\u00a8",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\12\111\7\uffff\4\111\1\u00af\25\111\4\uffff\1\111\1\uffff"+
            "\4\111\1\u00af\25\111",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bd\2\uffff\1\u00bc\34\uffff\1\u00bd\2\uffff\1\u00bc",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\5\uffff\1\u00c0\31\uffff\1\u00bf\5\uffff\1\u00c0",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c5\14\uffff\1\u00c6\22\uffff\1\u00c5\14\uffff\1\u00c6",
            "\12\111\7\uffff\4\111\1\u00c7\25\111\4\uffff\1\111\1\uffff"+
            "\4\111\1\u00c7\25\111",
            "\12\111\7\uffff\3\111\1\u00c9\26\111\4\uffff\1\111\1\uffff"+
            "\3\111\1\u00c9\26\111",
            "\1\u00cb\37\uffff\1\u00cb",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4\24\uffff\1\u00d5\12\uffff\1\u00d4\24\uffff\1\u00d5",
            "\12\111\7\uffff\2\111\1\u00d6\27\111\4\uffff\1\111\1\uffff"+
            "\2\111\1\u00d6\27\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\145\u0096\1\u00d8\uff9a\u0096",
            "",
            "",
            "",
            "\1\u009a\1\uffff\12\u0099\22\uffff\1\u0098",
            "\12\u00da",
            "",
            "",
            "",
            "\1\u00db\37\uffff\1\u00db",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\10\uffff\1\u00e1\26\uffff\1\u00e0",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e4\22\uffff\1\u00e3\14\uffff\1\u00e4\22\uffff\1\u00e3",
            "\1\u00e5\2\uffff\1\u00e6\34\uffff\1\u00e5\2\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6\37\uffff\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "\12\111\7\uffff\16\111\1\u00fd\13\111\4\uffff\1\111\1\uffff"+
            "\16\111\1\u00fd\13\111",
            "",
            "",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\1\u0104\37\uffff\1\u0104",
            "",
            "\1\u0105\37\uffff\1\u0105",
            "",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\162\u0096\1\u0110\uff8d\u0096",
            "",
            "\12\u00da\13\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "",
            "",
            "\12\111\7\uffff\21\111\1\u011b\10\111\4\uffff\1\111\1\uffff"+
            "\21\111\1\u011b\10\111",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u011f\37\uffff\1\u011f",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\37\uffff\1\u0130",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\1\u0132\37\uffff\1\u0132",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\1\u0136\37\uffff\1\u0136",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\147\u0096\1\u013c\uff98\u0096",
            "",
            "",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0144",
            "\1\u0145\37\uffff\1\u0145",
            "",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "",
            "\1\u0149\37\uffff\1\u0149",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u014b\37\uffff\1\u014b",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\1\u0151\37\uffff\1\u0151",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "\145\u0096\1\u015d\uff9a\u0096",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u0167\37\uffff\1\u0167",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u0169\37\uffff\1\u0169",
            "",
            "\1\u016a\37\uffff\1\u016a",
            "",
            "\1\u016b\37\uffff\1\u016b",
            "\1\u016c\37\uffff\1\u016c",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\1\u016e\37\uffff\1\u016e",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\u0096\1\u0171\uffd8\u0096",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u0175\37\uffff\1\u0175",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u0177\37\uffff\1\u0177",
            "\1\u0178\37\uffff\1\u0178",
            "\1\u0179\37\uffff\1\u0179",
            "",
            "\1\u017a\37\uffff\1\u017a",
            "",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "\1\u0181\37\uffff\1\u0181",
            "\1\u0182\37\uffff\1\u0182",
            "",
            "\1\u0183\37\uffff\1\u0183",
            "",
            "\1\u0184\37\uffff\1\u0184",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_88 | KEYWORD_89 | KEYWORD_90 | KEYWORD_91 | KEYWORD_81 | KEYWORD_82 | KEYWORD_83 | KEYWORD_84 | KEYWORD_85 | KEYWORD_86 | KEYWORD_87 | KEYWORD_76 | KEYWORD_77 | KEYWORD_78 | KEYWORD_79 | KEYWORD_80 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_74 | KEYWORD_75 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_70 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | RULE_COGROUP_TYPE | RULE_SL_COMMENT | RULE_DIGIT | RULE_LETTER | RULE_SPECIALCHAR | RULE_FLOATINGPOINT | RULE_LONGINTEGER | RULE_DOUBLENUMBER | RULE_EXECCOMMAND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_316 = input.LA(1);

                        s = -1;
                        if ( (LA17_316=='e') ) {s = 349;}

                        else if ( ((LA17_316>='\u0000' && LA17_316<='d')||(LA17_316>='f' && LA17_316<='\uFFFF')) ) {s = 150;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_349 = input.LA(1);

                        s = -1;
                        if ( (LA17_349=='\'') ) {s = 369;}

                        else if ( ((LA17_349>='\u0000' && LA17_349<='&')||(LA17_349>='(' && LA17_349<='\uFFFF')) ) {s = 150;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_64 = input.LA(1);

                        s = -1;
                        if ( ((LA17_64>='\u0000' && LA17_64<='\uFFFF')) ) {s = 156;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_149 = input.LA(1);

                        s = -1;
                        if ( (LA17_149=='e') ) {s = 216;}

                        else if ( ((LA17_149>='\u0000' && LA17_149<='d')||(LA17_149>='f' && LA17_149<='\uFFFF')) ) {s = 150;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_216 = input.LA(1);

                        s = -1;
                        if ( (LA17_216=='r') ) {s = 272;}

                        else if ( ((LA17_216>='\u0000' && LA17_216<='q')||(LA17_216>='s' && LA17_216<='\uFFFF')) ) {s = 150;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_272 = input.LA(1);

                        s = -1;
                        if ( (LA17_272=='g') ) {s = 316;}

                        else if ( ((LA17_272>='\u0000' && LA17_272<='f')||(LA17_272>='h' && LA17_272<='\uFFFF')) ) {s = 150;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_42 = input.LA(1);

                        s = -1;
                        if ( (LA17_42=='m') ) {s = 149;}

                        else if ( ((LA17_42>='\u0000' && LA17_42<='l')||(LA17_42>='n' && LA17_42<='\uFFFF')) ) {s = 150;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='B') ) {s = 1;}

                        else if ( (LA17_0=='C') ) {s = 2;}

                        else if ( (LA17_0=='M') ) {s = 3;}

                        else if ( (LA17_0=='P') ) {s = 4;}

                        else if ( (LA17_0=='%') ) {s = 5;}

                        else if ( (LA17_0=='D') ) {s = 6;}

                        else if ( (LA17_0=='G') ) {s = 7;}

                        else if ( (LA17_0=='R') ) {s = 8;}

                        else if ( (LA17_0=='E') ) {s = 9;}

                        else if ( (LA17_0=='F') ) {s = 10;}

                        else if ( (LA17_0=='T') ) {s = 11;}

                        else if ( (LA17_0=='S') ) {s = 12;}

                        else if ( (LA17_0=='I') ) {s = 13;}

                        else if ( (LA17_0=='L') ) {s = 14;}

                        else if ( (LA17_0=='O') ) {s = 15;}

                        else if ( (LA17_0=='U') ) {s = 16;}

                        else if ( (LA17_0=='J') ) {s = 17;}

                        else if ( (LA17_0=='N') ) {s = 18;}

                        else if ( (LA17_0=='A') ) {s = 19;}

                        else if ( (LA17_0=='!') ) {s = 20;}

                        else if ( (LA17_0==':') ) {s = 21;}

                        else if ( (LA17_0=='<') ) {s = 22;}

                        else if ( (LA17_0=='=') ) {s = 23;}

                        else if ( (LA17_0=='>') ) {s = 24;}

                        else if ( (LA17_0=='\\') ) {s = 25;}

                        else if ( (LA17_0=='#') ) {s = 26;}

                        else if ( (LA17_0=='$') ) {s = 27;}

                        else if ( (LA17_0=='(') ) {s = 28;}

                        else if ( (LA17_0==')') ) {s = 29;}

                        else if ( (LA17_0=='*') ) {s = 30;}

                        else if ( (LA17_0=='+') ) {s = 31;}

                        else if ( (LA17_0==',') ) {s = 32;}

                        else if ( (LA17_0=='-') ) {s = 33;}

                        else if ( (LA17_0=='.') ) {s = 34;}

                        else if ( (LA17_0=='/') ) {s = 35;}

                        else if ( (LA17_0==';') ) {s = 36;}

                        else if ( (LA17_0=='?') ) {s = 37;}

                        else if ( (LA17_0=='[') ) {s = 38;}

                        else if ( (LA17_0==']') ) {s = 39;}

                        else if ( (LA17_0=='{') ) {s = 40;}

                        else if ( (LA17_0=='}') ) {s = 41;}

                        else if ( (LA17_0=='\'') ) {s = 42;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 43;}

                        else if ( (LA17_0=='b') ) {s = 44;}

                        else if ( (LA17_0=='c') ) {s = 45;}

                        else if ( (LA17_0=='m') ) {s = 46;}

                        else if ( (LA17_0=='p') ) {s = 47;}

                        else if ( (LA17_0=='d') ) {s = 48;}

                        else if ( (LA17_0=='g') ) {s = 49;}

                        else if ( (LA17_0=='r') ) {s = 50;}

                        else if ( (LA17_0=='e') ) {s = 51;}

                        else if ( (LA17_0=='f') ) {s = 52;}

                        else if ( (LA17_0=='t') ) {s = 53;}

                        else if ( (LA17_0=='s') ) {s = 54;}

                        else if ( (LA17_0=='i') ) {s = 55;}

                        else if ( (LA17_0=='l') ) {s = 56;}

                        else if ( (LA17_0=='o') ) {s = 57;}

                        else if ( (LA17_0=='u') ) {s = 58;}

                        else if ( (LA17_0=='j') ) {s = 59;}

                        else if ( (LA17_0=='n') ) {s = 60;}

                        else if ( (LA17_0=='a') ) {s = 61;}

                        else if ( (LA17_0=='H'||LA17_0=='K'||LA17_0=='Q'||(LA17_0>='V' && LA17_0<='Z')) ) {s = 62;}

                        else if ( (LA17_0=='_') ) {s = 63;}

                        else if ( (LA17_0=='`') ) {s = 64;}

                        else if ( (LA17_0=='^') ) {s = 65;}

                        else if ( (LA17_0=='h'||LA17_0=='k'||LA17_0=='q'||(LA17_0>='v' && LA17_0<='z')) ) {s = 66;}

                        else if ( (LA17_0=='\"') ) {s = 67;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 68;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='&'||LA17_0=='@'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_67 = input.LA(1);

                        s = -1;
                        if ( ((LA17_67>='\u0000' && LA17_67<='\uFFFF')) ) {s = 150;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}