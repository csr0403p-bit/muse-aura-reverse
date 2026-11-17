package com.facebook.aura.pairs;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BQG;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class PairsGuidanceChanges {
    public static final int $stable = 0;
    public static final PairsGuidanceChanges INSTANCE = new PairsGuidanceChanges();
    public static final int MAXIMUM_COMPARED_CELLS = 1048576;

    public final class Parent {
        public final int indent;
        public final String item;

        public Parent(int i, String str) {
            C7384Etj.A0Y(str, 1);
            this.indent = i;
            this.item = str;
        }

        public final int getIndent() {
            return this.indent;
        }

        public final String getItem() {
            return this.item;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        if (r3 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean addsLines(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r9 = 0
            boolean r8 = X.AnonymousClass002.A1a(r11, r12)
            java.util.List r5 = r10.keyedLines(r11)
            java.util.List r7 = r10.keyedLines(r12)
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0O(r5, r7)
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.HxE r0 = (X.HxE) r0
            A r1 = r0.first
            B r0 = r0.second
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L34
            r4.add(r2)
            goto L19
        L34:
            int r6 = r4.size()
            java.util.List r0 = X.AbstractC0878AGe.A0Z(r5, r6)
            X.AGu r1 = X.BHL.A1B(r0)
            java.util.List r0 = X.AbstractC0878AGe.A0Z(r7, r6)
            X.AGu r0 = X.BHL.A1B(r0)
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0O(r1, r0)
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r3 = r0.iterator()
        L54:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.HxE r0 = (X.HxE) r0
            A r1 = r0.first
            B r0 = r0.second
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L6f
            r4.add(r2)
            goto L54
        L6f:
            int r1 = r4.size()
            int r0 = r5.size()
            int r0 = r0 - r1
            java.util.List r5 = r5.subList(r6, r0)
            int r0 = r7.size()
            int r0 = r0 - r1
            java.util.List r6 = r7.subList(r6, r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto Lcb
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lca
            int r0 = r5.size()
            long r3 = (long) r0
            int r0 = r6.size()
            long r0 = (long) r0
            long r3 = r3 * r0
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lca
            java.util.Iterator r4 = r6.iterator()
            r3 = 0
        La8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r2 = r4.next()
            int r1 = r5.size()
        Lb6:
            if (r3 >= r1) goto Lca
            java.lang.Object r0 = r5.get(r3)
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 == 0) goto Lc7
            if (r3 < 0) goto Lca
            int r3 = r3 + 1
            goto La8
        Lc7:
            int r3 = r3 + 1
            goto Lb6
        Lca:
            return r8
        Lcb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsGuidanceChanges.addsLines(java.lang.String, java.lang.String):boolean");
    }

    private final String withoutColon(String str) {
        CharSequence charSequenceA0G;
        if (C7BY.A0l(str, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR) || C7BY.A0l(str, '\uff1a')) {
            C7384Etj.A0Y(str, 0);
            int length = str.length() - 1;
            if (length < 0) {
                length = 0;
            }
            charSequenceA0G = C7BY.A0G(BQG.A17(str, length));
        } else {
            charSequenceA0G = C7BY.A0G(str);
        }
        return charSequenceA0G.toString();
    }

    private final List<String> keyedLines(String str) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = C7BY.A0h(str, new char[1], '\n').iterator();
        String strWithoutColon = null;
        while (it.hasNext()) {
            String string = C7BY.A0G(AnonymousClass005.A0j(it)).toString();
            String string2 = C7BY.A0H(string).toString();
            int length = string2.length();
            if (length != 0) {
                String strListItem = listItem(string2);
                if (strListItem == null) {
                    strWithoutColon = withoutColon(AnonymousClass002.A0l(C7BY.A0a(string2, '#')));
                    if (strWithoutColon.length() == 0) {
                        strWithoutColon = null;
                    }
                    arrayListA0h.clear();
                    arrayListA0h2.add(string);
                } else {
                    int length2 = C3cG.A1S(string.substring(0, string.length() - length)).length;
                    while (!arrayListA0h.isEmpty() && ((Parent) AbstractC0878AGe.A0H(arrayListA0h)).indent >= length2) {
                        arrayListA0h.remove(arrayListA0h.size() - 1);
                    }
                    if (strWithoutColon == null && arrayListA0h.isEmpty()) {
                        arrayListA0h2.add(string);
                    } else {
                        StringBuilder sbA0w = C60O.A0w();
                        if (strWithoutColon != null) {
                            sbA0w.append(strWithoutColon);
                            sbA0w.append(": ");
                        }
                        Iterator it2 = arrayListA0h.iterator();
                        while (it2.hasNext()) {
                            sbA0w.append(INSTANCE.withoutColon(((Parent) it2.next()).item));
                            sbA0w.append(" \u203a ");
                        }
                        arrayListA0h2.add(AnonymousClass001.A0v(strListItem, sbA0w));
                    }
                    arrayListA0h.add(new Parent(length2, strListItem));
                }
            }
        }
        return arrayListA0h2;
    }

    private final String listItem(String str) {
        String strSubstring;
        String strSubstring2;
        int length = str.length();
        if (length < 2 || !C7BY.A0k("-*+", str.charAt(0)) || str.charAt(1) != ' ') {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('0' > cCharAt || cCharAt >= ':') {
                    strSubstring = str.substring(i);
                    break;
                }
            }
            strSubstring = "";
            int length2 = strSubstring.length();
            if (length2 != length && length2 >= 2 && C7BY.A0k(".)", strSubstring.charAt(0)) && strSubstring.charAt(1) == ' ') {
                strSubstring2 = strSubstring.substring(2);
            }
            return null;
        }
        strSubstring2 = str.substring(2);
        String strA0l = AnonymousClass002.A0l(strSubstring2);
        if (strA0l.length() != 0) {
            return strA0l;
        }
        return null;
    }
}
