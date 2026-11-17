package X;

import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class FY4 extends EnumC10327Guh {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public FY4(int i) {
        String str;
        int i2;
        this.$t = i;
        switch (i) {
            case 0:
                str = "TagName";
                i2 = 9;
                break;
            case 1:
                str = "RcdataLessthanSign";
                i2 = 10;
                break;
            case 2:
                str = "RCDATAEndTagOpen";
                i2 = 11;
                break;
            case 3:
                str = "RCDATAEndTagName";
                i2 = 12;
                break;
            case 4:
                str = "RawtextLessthanSign";
                i2 = 13;
                break;
            case 5:
                str = "RawtextEndTagOpen";
                i2 = 14;
                break;
            case 6:
                str = "RawtextEndTagName";
                i2 = 15;
                break;
            case 7:
                str = "ScriptDataLessthanSign";
                i2 = 16;
                break;
            case 8:
                str = "ScriptDataEndTagOpen";
                i2 = 17;
                break;
            case 9:
                str = "ScriptDataEndTagName";
                i2 = 18;
                break;
            case 10:
                str = "Data";
                i2 = 0;
                break;
            case 11:
                str = "ScriptDataEscapeStart";
                i2 = 19;
                break;
            case 12:
                str = "ScriptDataEscapeStartDash";
                i2 = 20;
                break;
            case 13:
                str = "ScriptDataEscaped";
                i2 = 21;
                break;
            case 14:
                str = "ScriptDataEscapedDash";
                i2 = 22;
                break;
            case 15:
                str = "ScriptDataEscapedDashDash";
                i2 = 23;
                break;
            case 16:
                str = "ScriptDataEscapedLessthanSign";
                i2 = 24;
                break;
            case 17:
                str = "ScriptDataEscapedEndTagOpen";
                i2 = 25;
                break;
            case 18:
                str = "ScriptDataEscapedEndTagName";
                i2 = 26;
                break;
            case 19:
                str = "ScriptDataDoubleEscapeStart";
                i2 = 27;
                break;
            case 20:
                str = "ScriptDataDoubleEscaped";
                i2 = 28;
                break;
            case 21:
                str = "CharacterReferenceInData";
                i2 = 1;
                break;
            case 22:
                str = "ScriptDataDoubleEscapedDash";
                i2 = 29;
                break;
            case 23:
                str = "ScriptDataDoubleEscapedDashDash";
                i2 = 30;
                break;
            case 24:
                str = "ScriptDataDoubleEscapedLessthanSign";
                i2 = 31;
                break;
            case 25:
                str = "ScriptDataDoubleEscapeEnd";
                i2 = 32;
                break;
            case 26:
                str = "BeforeAttributeName";
                i2 = 33;
                break;
            case 27:
                str = "AttributeName";
                i2 = 34;
                break;
            case 28:
                str = "AfterAttributeName";
                i2 = 35;
                break;
            case 29:
                str = "BeforeAttributeValue";
                i2 = 36;
                break;
            case 30:
                str = "AttributeValue_doubleQuoted";
                i2 = 37;
                break;
            case 31:
                str = "AttributeValue_singleQuoted";
                i2 = 38;
                break;
            case 32:
                str = "Rcdata";
                i2 = 2;
                break;
            case 33:
                str = "AttributeValue_unquoted";
                i2 = 39;
                break;
            case 34:
                str = "AfterAttributeValue_quoted";
                i2 = 40;
                break;
            case 35:
                str = "SelfClosingStartTag";
                i2 = 41;
                break;
            case 36:
                str = "BogusComment";
                i2 = 42;
                break;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                str = "MarkupDeclarationOpen";
                i2 = 43;
                break;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                str = "MarkupProcessingOpen";
                i2 = 44;
                break;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                str = "CommentStart";
                i2 = 45;
                break;
            case 40:
                str = "CommentStartDash";
                i2 = 46;
                break;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                str = "Comment";
                i2 = 47;
                break;
            case 42:
                str = "CommentEndDash";
                i2 = 48;
                break;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                str = "CharacterReferenceInRcdata";
                i2 = 3;
                break;
            case 44:
                str = "CommentEnd";
                i2 = 49;
                break;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                str = "CommentEndBang";
                i2 = 50;
                break;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                str = "Doctype";
                i2 = 51;
                break;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                str = "BeforeDoctypeName";
                i2 = 52;
                break;
            case 48:
                str = "DoctypeName";
                i2 = 53;
                break;
            default:
                str = "AfterDoctypeName";
                i2 = 54;
                break;
        }
        super(str, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0569, code lost:
    
        if (r3 != '\uffff') goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x063e, code lost:
    
        if (r1 != '\uffff') goto L431;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:311:0x0476. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018b A[PHI: r1
  0x018b: PHI (r1v133 char) = (r1v131 char), (r1v136 char) binds: [B:117:0x0189, B:105:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d4 A[PHI: r1
  0x02d4: PHI (r1v117 char) = (r1v115 char), (r1v121 char) binds: [B:193:0x02d2, B:183:0x02b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e0 A[PHI: r1
  0x02e0: PHI (r1v129 char) = (r1v115 char), (r1v131 char) binds: [B:193:0x02d2, B:117:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x08ab A[PHI: r2
  0x08ab: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v8 java.lang.String) binds: [B:539:0x0877, B:529:0x085b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0a3b  */
    @Override // X.EnumC10327Guh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.GtL r9, X.C10318GuY r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FY4.A04(X.GtL, X.GuY):void");
    }
}
