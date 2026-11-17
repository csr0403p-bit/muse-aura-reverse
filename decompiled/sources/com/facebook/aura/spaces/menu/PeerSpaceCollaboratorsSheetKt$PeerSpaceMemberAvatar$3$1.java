package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class PeerSpaceCollaboratorsSheetKt$PeerSpaceMemberAvatar$3$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final PeerSpaceCollaboratorsSheetKt$PeerSpaceMemberAvatar$3$1 INSTANCE = new PeerSpaceCollaboratorsSheetKt$PeerSpaceMemberAvatar$3$1();

    public PeerSpaceCollaboratorsSheetKt$PeerSpaceMemberAvatar$3$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.length() != 0) {
            return AnonymousClass006.A0q(str.charAt(0));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
