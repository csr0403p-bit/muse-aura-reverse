package com.facebook.aura.markdown.parser.custom;

import X.C06827l3;
import X.C1Lu;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.G0U;

/* loaded from: classes4.dex */
public final class BacktickStripper {
    public static final BacktickStripper INSTANCE = new BacktickStripper();
    public static final C06827l3 INLINE_BACKTICK_FILE_LINK = C06827l3.A02("`(\\[[^\\]\\n`]+]\\((?:sandbox://|workspace/|hatch-slides://)[^)\\n`]+\\))`");

    public static final CharSequence strip$lambda$0(C1Lu c1Lu) {
        C7384Etj.A0Y(c1Lu, 0);
        return (CharSequence) C8j4.A0q(c1Lu.AG1());
    }

    public final String strip(String str) {
        C7384Etj.A0Y(str, 0);
        return C7BY.A0k(str, '`') ? INLINE_BACKTICK_FILE_LINK.A04(str, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.BacktickStripper$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return BacktickStripper.strip$lambda$0((C1Lu) obj);
            }
        }) : str;
    }
}
