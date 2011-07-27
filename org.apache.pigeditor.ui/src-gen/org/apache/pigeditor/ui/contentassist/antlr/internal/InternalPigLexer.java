package org.apache.pigeditor.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPigLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_LETTER=14;
    public static final int RULE_COGROUP_TYPE=12;
    public static final int RULE_ML_COMMENT=17;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int RULE_DIGIT=8;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int RULE_LONGINTEGER=10;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_BACKQUOTE_STRING=16;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_EXECCOMMAND=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLENUMBER=13;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=4;
    public static final int RULE_FLOATINGPOINT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SPECIALCHAR=15;
    public static final int RULE_WS=18;

    // delegates
    // delegators

    public InternalPigLexer() {;} 
    public InternalPigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:11:7: ( 'MAP[]' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:11:9: 'MAP[]'
            {
            match("MAP[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:12:7: ( 'EQ' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:12:9: 'EQ'
            {
            match("EQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:13:7: ( 'GT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:13:9: 'GT'
            {
            match("GT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:14:7: ( 'LT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:14:9: 'LT'
            {
            match("LT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:15:7: ( 'GTE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:15:9: 'GTE'
            {
            match("GTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16:7: ( 'LTE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16:9: 'LTE'
            {
            match("LTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:17:7: ( 'NEQ' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:17:9: 'NEQ'
            {
            match("NEQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:18:7: ( '==' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:18:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:19:7: ( '<' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:20:7: ( '<=' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:20:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:21:7: ( '>' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:22:7: ( '>=' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:22:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:23:7: ( '!=' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:23:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:24:7: ( ';' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:25:7: ( '#' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:25:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:26:7: ( ',' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:27:7: ( '/' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:27:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:28:7: ( '%' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:28:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:29:7: ( '+' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:30:7: ( '-' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:31:7: ( '*' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:32:7: ( '$' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:32:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:33:7: ( '.' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:33:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:34:7: ( '::' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:34:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:35:7: ( 'NULL' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:35:9: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:36:7: ( 'MATCHES' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:36:9: 'MATCHES'
            {
            match("MATCHES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:37:7: ( 'ALL' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:37:9: 'ALL'
            {
            match("ALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:38:7: ( '\\\\' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:38:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:39:7: ( 'INT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:39:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:40:7: ( 'LONG' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:40:9: 'LONG'
            {
            match("LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:41:7: ( 'FLOAT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:41:9: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:42:7: ( 'DOUBLE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:42:9: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:43:7: ( 'CHARARRAY' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:43:9: 'CHARARRAY'
            {
            match("CHARARRAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:44:7: ( 'BYTEARRAY' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:44:9: 'BYTEARRAY'
            {
            match("BYTEARRAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:45:7: ( 'ASC' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:45:9: 'ASC'
            {
            match("ASC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:46:7: ( 'DESC' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:46:9: 'DESC'
            {
            match("DESC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:47:7: ( 'LEFT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:47:9: 'LEFT'
            {
            match("LEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:48:7: ( 'RIGHT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:48:9: 'RIGHT'
            {
            match("RIGHT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:49:7: ( 'FULL' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:49:9: 'FULL'
            {
            match("FULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:50:7: ( 'ANY' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:50:9: 'ANY'
            {
            match("ANY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:51:7: ( 'INNER' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:51:9: 'INNER'
            {
            match("INNER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:52:7: ( 'OUTER' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:52:9: 'OUTER'
            {
            match("OUTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:53:7: ( 'GROUP' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:53:9: 'GROUP'
            {
            match("GROUP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:54:7: ( '\\\\u' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:54:9: '\\\\u'
            {
            match("\\u"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:55:7: ( '=' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:55:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:56:7: ( 'LOAD' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:56:9: 'LOAD'
            {
            match("LOAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:57:7: ( 'FOREACH' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:57:9: 'FOREACH'
            {
            match("FOREACH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:58:7: ( 'FILTER' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:58:9: 'FILTER'
            {
            match("FILTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:59:7: ( 'BY' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:59:9: 'BY'
            {
            match("BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:60:7: ( 'USING' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:60:9: 'USING'
            {
            match("USING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:61:7: ( 'COGROUP' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:61:9: 'COGROUP'
            {
            match("COGROUP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:62:7: ( 'ORDER' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:62:9: 'ORDER'
            {
            match("ORDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:63:7: ( 'CROSS' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:63:9: 'CROSS'
            {
            match("CROSS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:64:7: ( 'UNION' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:64:9: 'UNION'
            {
            match("UNION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:65:7: ( 'ON' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:65:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:66:7: ( 'JOIN' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:66:9: 'JOIN'
            {
            match("JOIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:67:7: ( 'LIMIT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:67:9: 'LIMIT'
            {
            match("LIMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:68:7: ( 'SAMPLE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:68:9: 'SAMPLE'
            {
            match("SAMPLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:69:7: ( 'DISTINCT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:69:9: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:70:7: ( 'STREAM' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:70:9: 'STREAM'
            {
            match("STREAM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:71:7: ( 'THROUGH' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:71:9: 'THROUGH'
            {
            match("THROUGH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:72:7: ( 'MAPREDUCE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:72:9: 'MAPREDUCE'
            {
            match("MAPREDUCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:73:7: ( 'SPLIT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:73:9: 'SPLIT'
            {
            match("SPLIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:74:7: ( 'INTO' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:74:9: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:75:7: ( 'STORE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:75:9: 'STORE'
            {
            match("STORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:76:7: ( 'DESCRIBE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:76:9: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:77:7: ( 'EXPLAIN' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:77:9: 'EXPLAIN'
            {
            match("EXPLAIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:78:7: ( 'DUMP' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:78:9: 'DUMP'
            {
            match("DUMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:79:7: ( '(' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:79:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:80:7: ( ')' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:80:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:81:7: ( 'OR' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:81:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:82:7: ( 'AND' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:82:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:83:7: ( '?' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:83:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:84:7: ( ':' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:84:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:85:7: ( 'IS' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:85:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:86:7: ( 'NOT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:86:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:87:7: ( 'AS' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:87:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:88:7: ( 'PARALLEL' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:88:9: 'PARALLEL'
            {
            match("PARALLEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:89:7: ( 'REGISTER' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:89:9: 'REGISTER'
            {
            match("REGISTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:90:7: ( '%DEFAULT' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:90:9: '%DEFAULT'
            {
            match("%DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:91:8: ( '%DECLARE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:91:10: '%DECLARE'
            {
            match("%DECLARE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:92:8: ( 'DEFINE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:92:10: 'DEFINE'
            {
            match("DEFINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:93:8: ( 'TUPLE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:93:10: 'TUPLE'
            {
            match("TUPLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:94:8: ( 'BAG' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:94:10: 'BAG'
            {
            match("BAG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:95:8: ( '{' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:95:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:96:8: ( '}' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:96:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:97:8: ( 'PARTITION' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:97:10: 'PARTITION'
            {
            match("PARTITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:98:8: ( 'GENERATE' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:98:10: 'GENERATE'
            {
            match("GENERATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:99:8: ( 'IF' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:99:10: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "RULE_COGROUP_TYPE"
    public final void mRULE_COGROUP_TYPE() throws RecognitionException {
        try {
            int _type = RULE_COGROUP_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16580:19: ( '\\'' 'merge' '\\'' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16580:21: '\\'' 'merge' '\\''
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16582:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16582:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16582:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16582:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16582:40: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16582:41: ( '\\r' )? '\\n'
                    {
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16582:41: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16582:41: '\\r'
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16584:12: ( '0' .. '9' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16584:14: '0' .. '9'
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16586:13: ( 'A' .. 'Z' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16586:15: 'A' .. 'Z'
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16588:18: ( '_' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16588:20: '_'
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16590:20: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )+ )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16590:22: ( RULE_DIGIT )+ '.' ( RULE_DIGIT )+
            {
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16590:22: ( RULE_DIGIT )+
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
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16590:22: RULE_DIGIT
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16590:38: ( RULE_DIGIT )+
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
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16590:38: RULE_DIGIT
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16592:18: ( RULE_INT 'L' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16592:20: RULE_INT 'L'
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16594:19: ( RULE_FLOATINGPOINT ( 'E' ( '-' | '+' )? RULE_INT )? )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16594:21: RULE_FLOATINGPOINT ( 'E' ( '-' | '+' )? RULE_INT )?
            {
            mRULE_FLOATINGPOINT(); 
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16594:40: ( 'E' ( '-' | '+' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16594:41: 'E' ( '-' | '+' )? RULE_INT
                    {
                    match('E'); 
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16594:45: ( '-' | '+' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16596:18: ( '`' (~ ( '`' ) )* '`' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16596:20: '`' (~ ( '`' ) )* '`'
            {
            match('`'); 
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16596:24: (~ ( '`' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='_')||(LA8_0>='a' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16596:24: ~ ( '`' )
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

    // $ANTLR start "RULE_BACKQUOTE_STRING"
    public final void mRULE_BACKQUOTE_STRING() throws RecognitionException {
        try {
            int _type = RULE_BACKQUOTE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16598:23: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '`' | '`' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16598:25: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '`' | '`' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16598:29: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '`' | '`' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='_')||(LA9_0>='a' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16598:30: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '`' | '`' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\\'||input.LA(1)=='`'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16598:74: ~ ( ( '\\\\' | '`' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "RULE_BACKQUOTE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16600:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16600:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16600:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16600:11: '^'
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

            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16600:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:
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
            	    break loop11;
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16602:10: ( ( '0' .. '9' )+ )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16602:12: ( '0' .. '9' )+
            {
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16602:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16602:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16604:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16606:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16606:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16606:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16606:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16608:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16608:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16608:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16610:16: ( . )
            // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:16610:18: .
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
        // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | RULE_COGROUP_TYPE | RULE_SL_COMMENT | RULE_DIGIT | RULE_LETTER | RULE_SPECIALCHAR | RULE_FLOATINGPOINT | RULE_LONGINTEGER | RULE_DOUBLENUMBER | RULE_EXECCOMMAND | RULE_BACKQUOTE_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=105;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:226: T__56
                {
                mT__56(); 

                }
                break;
            case 38 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:232: T__57
                {
                mT__57(); 

                }
                break;
            case 39 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:238: T__58
                {
                mT__58(); 

                }
                break;
            case 40 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:244: T__59
                {
                mT__59(); 

                }
                break;
            case 41 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:250: T__60
                {
                mT__60(); 

                }
                break;
            case 42 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:256: T__61
                {
                mT__61(); 

                }
                break;
            case 43 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:262: T__62
                {
                mT__62(); 

                }
                break;
            case 44 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:268: T__63
                {
                mT__63(); 

                }
                break;
            case 45 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:274: T__64
                {
                mT__64(); 

                }
                break;
            case 46 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:280: T__65
                {
                mT__65(); 

                }
                break;
            case 47 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:286: T__66
                {
                mT__66(); 

                }
                break;
            case 48 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:292: T__67
                {
                mT__67(); 

                }
                break;
            case 49 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:298: T__68
                {
                mT__68(); 

                }
                break;
            case 50 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:304: T__69
                {
                mT__69(); 

                }
                break;
            case 51 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:310: T__70
                {
                mT__70(); 

                }
                break;
            case 52 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:316: T__71
                {
                mT__71(); 

                }
                break;
            case 53 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:322: T__72
                {
                mT__72(); 

                }
                break;
            case 54 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:328: T__73
                {
                mT__73(); 

                }
                break;
            case 55 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:334: T__74
                {
                mT__74(); 

                }
                break;
            case 56 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:340: T__75
                {
                mT__75(); 

                }
                break;
            case 57 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:346: T__76
                {
                mT__76(); 

                }
                break;
            case 58 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:352: T__77
                {
                mT__77(); 

                }
                break;
            case 59 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:358: T__78
                {
                mT__78(); 

                }
                break;
            case 60 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:364: T__79
                {
                mT__79(); 

                }
                break;
            case 61 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:370: T__80
                {
                mT__80(); 

                }
                break;
            case 62 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:376: T__81
                {
                mT__81(); 

                }
                break;
            case 63 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:382: T__82
                {
                mT__82(); 

                }
                break;
            case 64 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:388: T__83
                {
                mT__83(); 

                }
                break;
            case 65 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:394: T__84
                {
                mT__84(); 

                }
                break;
            case 66 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:400: T__85
                {
                mT__85(); 

                }
                break;
            case 67 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:406: T__86
                {
                mT__86(); 

                }
                break;
            case 68 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:412: T__87
                {
                mT__87(); 

                }
                break;
            case 69 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:418: T__88
                {
                mT__88(); 

                }
                break;
            case 70 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:424: T__89
                {
                mT__89(); 

                }
                break;
            case 71 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:430: T__90
                {
                mT__90(); 

                }
                break;
            case 72 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:436: T__91
                {
                mT__91(); 

                }
                break;
            case 73 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:442: T__92
                {
                mT__92(); 

                }
                break;
            case 74 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:448: T__93
                {
                mT__93(); 

                }
                break;
            case 75 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:454: T__94
                {
                mT__94(); 

                }
                break;
            case 76 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:460: T__95
                {
                mT__95(); 

                }
                break;
            case 77 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:466: T__96
                {
                mT__96(); 

                }
                break;
            case 78 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:472: T__97
                {
                mT__97(); 

                }
                break;
            case 79 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:478: T__98
                {
                mT__98(); 

                }
                break;
            case 80 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:484: T__99
                {
                mT__99(); 

                }
                break;
            case 81 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:490: T__100
                {
                mT__100(); 

                }
                break;
            case 82 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:497: T__101
                {
                mT__101(); 

                }
                break;
            case 83 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:504: T__102
                {
                mT__102(); 

                }
                break;
            case 84 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:511: T__103
                {
                mT__103(); 

                }
                break;
            case 85 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:518: T__104
                {
                mT__104(); 

                }
                break;
            case 86 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:525: T__105
                {
                mT__105(); 

                }
                break;
            case 87 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:532: T__106
                {
                mT__106(); 

                }
                break;
            case 88 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:539: T__107
                {
                mT__107(); 

                }
                break;
            case 89 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:546: T__108
                {
                mT__108(); 

                }
                break;
            case 90 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:553: RULE_COGROUP_TYPE
                {
                mRULE_COGROUP_TYPE(); 

                }
                break;
            case 91 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:571: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:587: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 93 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:598: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 94 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:610: RULE_SPECIALCHAR
                {
                mRULE_SPECIALCHAR(); 

                }
                break;
            case 95 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:627: RULE_FLOATINGPOINT
                {
                mRULE_FLOATINGPOINT(); 

                }
                break;
            case 96 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:646: RULE_LONGINTEGER
                {
                mRULE_LONGINTEGER(); 

                }
                break;
            case 97 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:663: RULE_DOUBLENUMBER
                {
                mRULE_DOUBLENUMBER(); 

                }
                break;
            case 98 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:681: RULE_EXECCOMMAND
                {
                mRULE_EXECCOMMAND(); 

                }
                break;
            case 99 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:698: RULE_BACKQUOTE_STRING
                {
                mRULE_BACKQUOTE_STRING(); 

                }
                break;
            case 100 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:720: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 101 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:728: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 102 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:737: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 103 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:749: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 104 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:765: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 105 :
                // ../org.apache.pigeditor.ui/src-gen/org/apache/pigeditor/ui/contentassist/antlr/internal/InternalPig.g:1:773: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\5\63\1\102\1\104\1\106\1\61\3\uffff\1\114\1\116\1\uffff"+
        "\1\121\3\uffff\1\126\1\63\1\133\13\63\3\uffff\1\63\2\uffff\1\61"+
        "\1\u0081\1\63\1\u0085\2\61\1\uffff\1\61\2\uffff\1\64\2\uffff\1\u008c"+
        "\1\64\1\u008f\2\64\1\u0093\6\64\26\uffff\1\64\1\u009e\1\64\2\uffff"+
        "\1\64\1\u00a3\1\u00a4\13\64\1\u00b2\4\64\1\u00b8\1\u00b9\10\64\3"+
        "\uffff\1\64\6\uffff\1\u00c5\6\uffff\2\64\1\uffff\1\64\1\u00ce\1"+
        "\uffff\2\64\1\u00d1\1\uffff\4\64\1\u00d6\1\64\1\u00d8\1\uffff\1"+
        "\u00db\1\u00dc\1\uffff\1\u00dd\1\u00de\1\u00e0\1\64\2\uffff\15\64"+
        "\1\uffff\1\u00ef\4\64\2\uffff\12\64\2\uffff\1\u0100\1\u00c9\3\uffff"+
        "\3\64\1\uffff\2\64\1\uffff\1\u0108\1\u0109\1\u010a\1\64\1\uffff"+
        "\1\u010c\7\uffff\1\u010d\1\uffff\2\64\1\u0110\3\64\1\u0115\2\64"+
        "\1\u0118\4\64\1\uffff\6\64\1\u0123\10\64\4\uffff\3\64\1\u0130\1"+
        "\64\3\uffff\1\u0132\2\uffff\1\u0133\1\u0134\1\uffff\4\64\1\uffff"+
        "\2\64\1\uffff\2\64\1\u013d\1\64\1\u013f\1\64\1\u0141\1\u0142\1\u0143"+
        "\1\u0144\1\uffff\2\64\1\u0147\1\u0148\1\64\1\u014a\2\64\1\uffff"+
        "\3\64\1\uffff\1\64\3\uffff\1\64\1\u0153\1\u0154\1\64\1\u0156\3\64"+
        "\1\uffff\1\64\1\uffff\1\64\4\uffff\1\u015c\1\u015d\2\uffff\1\64"+
        "\1\uffff\2\64\1\uffff\1\64\1\u0163\1\u0164\1\64\1\u0166\2\uffff"+
        "\1\64\1\uffff\2\64\1\u016a\2\64\2\uffff\1\u016d\2\64\1\uffff\1\64"+
        "\2\uffff\1\u0172\1\uffff\1\u0173\1\u0174\1\64\1\uffff\1\64\1\u0177"+
        "\1\uffff\1\u0178\1\64\1\uffff\1\u017a\3\uffff\1\u017b\1\u017c\2"+
        "\uffff\1\u017d\4\uffff";
    static final String DFA18_eofS =
        "\u017e\uffff";
    static final String DFA18_minS =
        "\1\0\5\60\4\75\3\uffff\1\52\1\104\1\uffff\1\55\3\uffff\1\72\1\60"+
        "\1\165\13\60\3\uffff\1\60\2\uffff\1\0\1\56\2\60\1\0\1\101\1\uffff"+
        "\1\0\2\uffff\1\120\2\uffff\1\60\1\120\1\60\1\117\1\116\1\60\1\101"+
        "\1\106\1\115\1\121\1\114\1\124\14\uffff\1\105\11\uffff\1\114\1\60"+
        "\1\104\2\uffff\1\116\2\60\1\117\1\114\1\122\1\114\1\125\1\106\1"+
        "\123\1\115\1\101\1\107\1\117\1\60\3\107\1\124\2\60\3\111\1\115\1"+
        "\117\1\114\1\122\1\120\3\uffff\1\122\2\uffff\1\0\3\uffff\1\56\1"+
        "\60\1\uffff\2\0\2\uffff\1\122\1\103\1\uffff\1\114\1\60\1\uffff\1"+
        "\125\1\105\1\60\1\uffff\1\107\1\104\1\124\1\111\1\60\1\114\1\60"+
        "\1\103\2\60\1\uffff\3\60\1\105\2\uffff\1\101\1\114\1\105\1\124\1"+
        "\102\1\103\1\111\1\124\1\120\2\122\1\123\1\105\1\uffff\1\60\1\110"+
        "\1\111\2\105\2\uffff\1\116\1\117\1\116\1\120\1\105\1\122\1\111\1"+
        "\117\1\114\1\101\1\0\1\uffff\1\60\2\0\2\uffff\1\105\1\110\1\101"+
        "\1\uffff\1\120\1\122\1\uffff\3\60\1\124\1\uffff\1\60\7\uffff\1\60"+
        "\1\uffff\1\122\1\124\1\60\1\101\1\105\1\114\1\60\1\116\1\111\1\60"+
        "\1\101\1\117\1\123\1\101\1\uffff\1\124\1\123\2\122\1\107\1\116\1"+
        "\60\1\114\1\101\1\105\1\124\1\125\1\105\1\114\1\111\1\0\3\uffff"+
        "\1\104\1\105\1\111\1\60\1\101\3\uffff\1\60\2\uffff\2\60\1\uffff"+
        "\1\103\1\122\1\105\1\111\1\uffff\1\105\1\116\1\uffff\1\122\1\125"+
        "\1\60\1\122\1\60\1\124\4\60\1\uffff\1\105\1\115\2\60\1\107\1\60"+
        "\1\114\1\124\1\0\1\125\1\123\1\116\1\uffff\1\124\3\uffff\1\110\2"+
        "\60\1\102\1\60\1\103\1\122\1\120\1\uffff\1\122\1\uffff\1\105\4\uffff"+
        "\2\60\2\uffff\1\110\1\uffff\1\105\1\111\1\0\1\103\2\60\1\105\1\60"+
        "\2\uffff\1\105\1\uffff\1\124\1\101\1\60\1\101\1\122\2\uffff\1\60"+
        "\1\114\1\117\1\uffff\1\105\2\uffff\1\60\1\uffff\2\60\1\131\1\uffff"+
        "\1\131\1\60\1\uffff\1\60\1\116\1\uffff\1\60\3\uffff\2\60\2\uffff"+
        "\1\60\4\uffff";
    static final String DFA18_maxS =
        "\1\uffff\5\172\4\75\3\uffff\1\52\1\104\1\uffff\1\55\3\uffff\1\72"+
        "\1\172\1\165\13\172\3\uffff\1\172\2\uffff\1\uffff\1\114\2\172\1"+
        "\uffff\1\172\1\uffff\1\uffff\2\uffff\1\124\2\uffff\1\172\1\120\1"+
        "\172\1\117\1\116\1\172\1\116\1\106\1\115\1\121\1\114\1\124\14\uffff"+
        "\1\105\11\uffff\1\114\1\172\1\131\2\uffff\1\124\2\172\1\117\1\114"+
        "\1\122\1\114\1\125\2\123\1\115\1\101\1\107\1\117\1\172\3\107\1\124"+
        "\2\172\3\111\1\115\1\122\1\114\1\122\1\120\3\uffff\1\122\2\uffff"+
        "\1\uffff\3\uffff\1\114\1\71\1\uffff\2\uffff\2\uffff\1\133\1\103"+
        "\1\uffff\1\114\1\172\1\uffff\1\125\1\105\1\172\1\uffff\1\107\1\104"+
        "\1\124\1\111\1\172\1\114\1\172\1\106\2\172\1\uffff\3\172\1\105\2"+
        "\uffff\1\101\1\114\1\105\1\124\1\102\1\103\1\111\1\124\1\120\2\122"+
        "\1\123\1\105\1\uffff\1\172\1\110\1\111\2\105\2\uffff\1\116\1\117"+
        "\1\116\1\120\1\105\1\122\1\111\1\117\1\114\1\124\1\uffff\1\uffff"+
        "\1\105\2\uffff\2\uffff\1\105\1\110\1\101\1\uffff\1\120\1\122\1\uffff"+
        "\3\172\1\124\1\uffff\1\172\7\uffff\1\172\1\uffff\1\122\1\124\1\172"+
        "\1\101\1\105\1\114\1\172\1\116\1\111\1\172\1\101\1\117\1\123\1\101"+
        "\1\uffff\1\124\1\123\2\122\1\107\1\116\1\172\1\114\1\101\1\105\1"+
        "\124\1\125\1\105\1\114\1\111\1\uffff\3\uffff\1\104\1\105\1\111\1"+
        "\172\1\101\3\uffff\1\172\2\uffff\2\172\1\uffff\1\103\1\122\1\105"+
        "\1\111\1\uffff\1\105\1\116\1\uffff\1\122\1\125\1\172\1\122\1\172"+
        "\1\124\4\172\1\uffff\1\105\1\115\2\172\1\107\1\172\1\114\1\124\1"+
        "\uffff\1\125\1\123\1\116\1\uffff\1\124\3\uffff\1\110\2\172\1\102"+
        "\1\172\1\103\1\122\1\120\1\uffff\1\122\1\uffff\1\105\4\uffff\2\172"+
        "\2\uffff\1\110\1\uffff\1\105\1\111\1\uffff\1\103\2\172\1\105\1\172"+
        "\2\uffff\1\105\1\uffff\1\124\1\101\1\172\1\101\1\122\2\uffff\1\172"+
        "\1\114\1\117\1\uffff\1\105\2\uffff\1\172\1\uffff\2\172\1\131\1\uffff"+
        "\1\131\1\172\1\uffff\1\172\1\116\1\uffff\1\172\3\uffff\2\172\2\uffff"+
        "\1\172\4\uffff";
    static final String DFA18_acceptS =
        "\12\uffff\1\16\1\17\1\20\2\uffff\1\23\1\uffff\1\25\1\26\1\27\16"+
        "\uffff\1\105\1\106\1\111\1\uffff\1\125\1\126\6\uffff\1\144\1\uffff"+
        "\1\150\1\151\1\uffff\1\135\1\144\14\uffff\1\10\1\55\1\12\1\11\1"+
        "\14\1\13\1\15\1\16\1\17\1\20\1\147\1\21\1\uffff\1\22\1\23\1\133"+
        "\1\24\1\25\1\26\1\27\1\30\1\112\3\uffff\1\54\1\34\35\uffff\1\105"+
        "\1\106\1\111\1\uffff\1\125\1\126\1\uffff\1\146\1\134\1\140\2\uffff"+
        "\1\136\2\uffff\1\142\1\150\2\uffff\1\2\2\uffff\1\3\3\uffff\1\4\12"+
        "\uffff\1\115\4\uffff\1\113\1\131\15\uffff\1\61\5\uffff\1\107\1\67"+
        "\13\uffff\1\145\3\uffff\1\142\1\1\3\uffff\1\5\2\uffff\1\6\4\uffff"+
        "\1\7\1\uffff\1\114\1\120\1\121\1\33\1\43\1\50\1\110\1\uffff\1\35"+
        "\16\uffff\1\124\20\uffff\1\137\1\141\1\143\5\uffff\1\36\1\56\1\45"+
        "\1\uffff\1\31\1\100\2\uffff\1\47\4\uffff\1\44\2\uffff\1\104\12\uffff"+
        "\1\70\14\uffff\1\53\1\uffff\1\71\1\51\1\37\10\uffff\1\65\1\uffff"+
        "\1\46\1\uffff\1\52\1\64\1\62\1\66\2\uffff\1\101\1\77\1\uffff\1\123"+
        "\10\uffff\1\60\1\40\1\uffff\1\122\5\uffff\1\72\1\74\3\uffff\1\132"+
        "\1\uffff\1\32\1\103\1\uffff\1\57\3\uffff\1\63\2\uffff\1\75\2\uffff"+
        "\1\132\1\uffff\1\130\1\102\1\73\2\uffff\1\117\1\116\1\uffff\1\76"+
        "\1\41\1\42\1\127";
    static final String DFA18_specialS =
        "\1\0\47\uffff\1\12\3\uffff\1\1\2\uffff\1\2\117\uffff\1\10\6\uffff"+
        "\1\3\1\14\74\uffff\1\4\2\uffff\1\11\1\13\66\uffff\1\5\54\uffff\1"+
        "\6\40\uffff\1\7\60\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\11\1\57\1\13\1\22\1\16\1"+
            "\61\1\50\1\42\1\43\1\21\1\17\1\14\1\20\1\23\1\15\12\51\1\24"+
            "\1\12\1\7\1\6\1\10\1\44\1\61\1\25\1\33\1\32\1\31\1\2\1\30\1"+
            "\3\1\52\1\27\1\37\1\52\1\4\1\1\1\5\1\35\1\45\1\52\1\34\1\40"+
            "\1\41\1\36\5\52\1\61\1\26\1\61\1\55\1\53\1\54\32\56\1\46\1\61"+
            "\1\47\uff82\61",
            "\12\64\7\uffff\1\62\31\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\20\64\1\65\6\64\1\66\2\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "\12\64\7\uffff\4\64\1\71\14\64\1\70\1\64\1\67\6\64\4\uffff"+
            "\1\64\1\uffff\32\64",
            "\12\64\7\uffff\4\64\1\74\3\64\1\75\5\64\1\73\4\64\1\72\6\64"+
            "\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\4\64\1\76\11\64\1\100\5\64\1\77\5\64\4\uffff"+
            "\1\64\1\uffff\32\64",
            "\1\101",
            "\1\103",
            "\1\105",
            "\1\107",
            "",
            "",
            "",
            "\1\113",
            "\1\115",
            "",
            "\1\120",
            "",
            "",
            "",
            "\1\125",
            "\12\64\7\uffff\13\64\1\127\1\64\1\131\4\64\1\130\7\64\4\uffff"+
            "\1\64\1\uffff\32\64",
            "\1\132",
            "\12\64\7\uffff\5\64\1\136\7\64\1\134\4\64\1\135\7\64\4\uffff"+
            "\1\64\1\uffff\32\64",
            "\12\64\7\uffff\10\64\1\142\2\64\1\137\2\64\1\141\5\64\1\140"+
            "\5\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\4\64\1\144\3\64\1\145\5\64\1\143\5\64\1\146"+
            "\5\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\7\64\1\147\6\64\1\150\2\64\1\151\10\64\4\uffff"+
            "\1\64\1\uffff\32\64",
            "\12\64\7\uffff\1\153\27\64\1\152\1\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "\12\64\7\uffff\4\64\1\155\3\64\1\154\21\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "\12\64\7\uffff\15\64\1\160\3\64\1\157\2\64\1\156\5\64\4\uffff"+
            "\1\64\1\uffff\32\64",
            "\12\64\7\uffff\15\64\1\162\4\64\1\161\7\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "\12\64\7\uffff\16\64\1\163\13\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\1\164\16\64\1\166\3\64\1\165\6\64\4\uffff\1"+
            "\64\1\uffff\32\64",
            "\12\64\7\uffff\7\64\1\167\14\64\1\170\5\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\1\174\31\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\155\u0080\1\177\uff92\u0080",
            "\1\u0084\1\uffff\12\u0083\22\uffff\1\u0082",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\134\u0087\1\u0086\3\u0087\1\u0088\uff9f\u0087",
            "\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\0\u0080",
            "",
            "",
            "\1\u008a\3\uffff\1\u008b",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u008d",
            "\12\64\7\uffff\4\64\1\u008e\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0090",
            "\1\u0091",
            "\12\64\7\uffff\4\64\1\u0092\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0095\14\uffff\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
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
            "\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "\12\64\7\uffff\2\64\1\u009d\27\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00a0\24\uffff\1\u009f",
            "",
            "",
            "\1\u00a2\5\uffff\1\u00a1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00ab\14\uffff\1\u00aa",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\64\7\uffff\23\64\1\u00b1\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\64\7\uffff\3\64\1\u00b7\26\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00bf\2\uffff\1\u00be",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "",
            "\1\u00c3",
            "",
            "",
            "\145\u0080\1\u00c4\uff9a\u0080",
            "",
            "",
            "",
            "\1\u0084\1\uffff\12\u0083\22\uffff\1\u0082",
            "\12\u00c6",
            "",
            "\134\u00c9\1\u00c8\3\u00c9\1\u00c7\1\u00c9\1\u00c8\3\u00c9"+
            "\1\u00c8\7\u00c9\1\u00c8\3\u00c9\1\u00c8\1\u00c9\2\u00c8\uff8a"+
            "\u00c9",
            "\134\u0087\1\u0086\3\u0087\1\u0088\uff9f\u0087",
            "",
            "",
            "\1\u00cb\10\uffff\1\u00ca",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00da\2\uffff\1\u00d9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\16\64\1\u00df\13\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u00e1",
            "",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd\22\uffff\1\u00fe",
            "\162\u0080\1\u00ff\uff8d\u0080",
            "",
            "\12\u00c6\13\uffff\1\u0101",
            "\0\u0102",
            "\134\u0087\1\u0086\3\u0087\1\u0088\uff9f\u0087",
            "",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u010b",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u010e",
            "\1\u010f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\12\64\7\uffff\21\64\1\u0114\10\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0116",
            "\1\u0117",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\147\u0080\1\u012c\uff98\u0080",
            "",
            "",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0131",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u013e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0140",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0145",
            "\1\u0146",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0149",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u014b",
            "\1\u014c",
            "\145\u0080\1\u014d\uff9a\u0080",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151",
            "",
            "",
            "",
            "\1\u0152",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0155",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\u015a",
            "",
            "\1\u015b",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u015e",
            "",
            "\1\u015f",
            "\1\u0160",
            "\47\u0080\1\u0161\uffd8\u0080",
            "\1\u0162",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0165",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0167",
            "",
            "\1\u0168",
            "\1\u0169",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u016b",
            "\1\u016c",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u016e",
            "\1\u016f",
            "",
            "\1\u0171",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0175",
            "",
            "\1\u0176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0179",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | RULE_COGROUP_TYPE | RULE_SL_COMMENT | RULE_DIGIT | RULE_LETTER | RULE_SPECIALCHAR | RULE_FLOATINGPOINT | RULE_LONGINTEGER | RULE_DOUBLENUMBER | RULE_EXECCOMMAND | RULE_BACKQUOTE_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='M') ) {s = 1;}

                        else if ( (LA18_0=='E') ) {s = 2;}

                        else if ( (LA18_0=='G') ) {s = 3;}

                        else if ( (LA18_0=='L') ) {s = 4;}

                        else if ( (LA18_0=='N') ) {s = 5;}

                        else if ( (LA18_0=='=') ) {s = 6;}

                        else if ( (LA18_0=='<') ) {s = 7;}

                        else if ( (LA18_0=='>') ) {s = 8;}

                        else if ( (LA18_0=='!') ) {s = 9;}

                        else if ( (LA18_0==';') ) {s = 10;}

                        else if ( (LA18_0=='#') ) {s = 11;}

                        else if ( (LA18_0==',') ) {s = 12;}

                        else if ( (LA18_0=='/') ) {s = 13;}

                        else if ( (LA18_0=='%') ) {s = 14;}

                        else if ( (LA18_0=='+') ) {s = 15;}

                        else if ( (LA18_0=='-') ) {s = 16;}

                        else if ( (LA18_0=='*') ) {s = 17;}

                        else if ( (LA18_0=='$') ) {s = 18;}

                        else if ( (LA18_0=='.') ) {s = 19;}

                        else if ( (LA18_0==':') ) {s = 20;}

                        else if ( (LA18_0=='A') ) {s = 21;}

                        else if ( (LA18_0=='\\') ) {s = 22;}

                        else if ( (LA18_0=='I') ) {s = 23;}

                        else if ( (LA18_0=='F') ) {s = 24;}

                        else if ( (LA18_0=='D') ) {s = 25;}

                        else if ( (LA18_0=='C') ) {s = 26;}

                        else if ( (LA18_0=='B') ) {s = 27;}

                        else if ( (LA18_0=='R') ) {s = 28;}

                        else if ( (LA18_0=='O') ) {s = 29;}

                        else if ( (LA18_0=='U') ) {s = 30;}

                        else if ( (LA18_0=='J') ) {s = 31;}

                        else if ( (LA18_0=='S') ) {s = 32;}

                        else if ( (LA18_0=='T') ) {s = 33;}

                        else if ( (LA18_0=='(') ) {s = 34;}

                        else if ( (LA18_0==')') ) {s = 35;}

                        else if ( (LA18_0=='?') ) {s = 36;}

                        else if ( (LA18_0=='P') ) {s = 37;}

                        else if ( (LA18_0=='{') ) {s = 38;}

                        else if ( (LA18_0=='}') ) {s = 39;}

                        else if ( (LA18_0=='\'') ) {s = 40;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 41;}

                        else if ( (LA18_0=='H'||LA18_0=='K'||LA18_0=='Q'||(LA18_0>='V' && LA18_0<='Z')) ) {s = 42;}

                        else if ( (LA18_0=='_') ) {s = 43;}

                        else if ( (LA18_0=='`') ) {s = 44;}

                        else if ( (LA18_0=='^') ) {s = 45;}

                        else if ( ((LA18_0>='a' && LA18_0<='z')) ) {s = 46;}

                        else if ( (LA18_0=='\"') ) {s = 47;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 48;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='&'||LA18_0=='@'||LA18_0=='['||LA18_0==']'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_44 = input.LA(1);

                        s = -1;
                        if ( (LA18_44=='\\') ) {s = 134;}

                        else if ( ((LA18_44>='\u0000' && LA18_44<='[')||(LA18_44>=']' && LA18_44<='_')||(LA18_44>='a' && LA18_44<='\uFFFF')) ) {s = 135;}

                        else if ( (LA18_44=='`') ) {s = 136;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_47 = input.LA(1);

                        s = -1;
                        if ( ((LA18_47>='\u0000' && LA18_47<='\uFFFF')) ) {s = 128;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_134 = input.LA(1);

                        s = -1;
                        if ( (LA18_134=='`') ) {s = 199;}

                        else if ( (LA18_134=='\\'||LA18_134=='b'||LA18_134=='f'||LA18_134=='n'||LA18_134=='r'||(LA18_134>='t' && LA18_134<='u')) ) {s = 200;}

                        else if ( ((LA18_134>='\u0000' && LA18_134<='[')||(LA18_134>=']' && LA18_134<='_')||LA18_134=='a'||(LA18_134>='c' && LA18_134<='e')||(LA18_134>='g' && LA18_134<='m')||(LA18_134>='o' && LA18_134<='q')||LA18_134=='s'||(LA18_134>='v' && LA18_134<='\uFFFF')) ) {s = 201;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_196 = input.LA(1);

                        s = -1;
                        if ( (LA18_196=='r') ) {s = 255;}

                        else if ( ((LA18_196>='\u0000' && LA18_196<='q')||(LA18_196>='s' && LA18_196<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_255 = input.LA(1);

                        s = -1;
                        if ( (LA18_255=='g') ) {s = 300;}

                        else if ( ((LA18_255>='\u0000' && LA18_255<='f')||(LA18_255>='h' && LA18_255<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_300 = input.LA(1);

                        s = -1;
                        if ( (LA18_300=='e') ) {s = 333;}

                        else if ( ((LA18_300>='\u0000' && LA18_300<='d')||(LA18_300>='f' && LA18_300<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_333 = input.LA(1);

                        s = -1;
                        if ( (LA18_333=='\'') ) {s = 353;}

                        else if ( ((LA18_333>='\u0000' && LA18_333<='&')||(LA18_333>='(' && LA18_333<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_127 = input.LA(1);

                        s = -1;
                        if ( (LA18_127=='e') ) {s = 196;}

                        else if ( ((LA18_127>='\u0000' && LA18_127<='d')||(LA18_127>='f' && LA18_127<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_199 = input.LA(1);

                        s = -1;
                        if ( ((LA18_199>='\u0000' && LA18_199<='\uFFFF')) ) {s = 258;}

                        else s = 201;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_40 = input.LA(1);

                        s = -1;
                        if ( (LA18_40=='m') ) {s = 127;}

                        else if ( ((LA18_40>='\u0000' && LA18_40<='l')||(LA18_40>='n' && LA18_40<='\uFFFF')) ) {s = 128;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_200 = input.LA(1);

                        s = -1;
                        if ( (LA18_200=='`') ) {s = 136;}

                        else if ( (LA18_200=='\\') ) {s = 134;}

                        else if ( ((LA18_200>='\u0000' && LA18_200<='[')||(LA18_200>=']' && LA18_200<='_')||(LA18_200>='a' && LA18_200<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA18_135 = input.LA(1);

                        s = -1;
                        if ( (LA18_135=='`') ) {s = 136;}

                        else if ( (LA18_135=='\\') ) {s = 134;}

                        else if ( ((LA18_135>='\u0000' && LA18_135<='[')||(LA18_135>=']' && LA18_135<='_')||(LA18_135>='a' && LA18_135<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}