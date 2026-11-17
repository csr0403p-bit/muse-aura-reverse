package com.facebook.aura.localbrowser.core;

import X.AbstractC7607F5u;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C0881AGi;
import X.C7384Etj;
import X.F60;
import X.FKC;
import X.G0U;
import X.Hr7;
import com.hatch.browser.protocol.Command;
import com.hatch.browser.protocol.ElementReadKind;
import com.hatch.browser.protocol.ElementRef;
import com.hatch.browser.protocol.ElementState;
import com.hatch.browser.protocol.InputTarget;
import com.hatch.browser.protocol.Key;
import com.hatch.browser.protocol.KeyChord;
import com.hatch.browser.protocol.NamedKey;
import com.hatch.browser.protocol.PageEdge;
import com.hatch.browser.protocol.PageReadKind;
import com.hatch.browser.protocol.RefScope;
import com.hatch.browser.protocol.ScrollDirection;
import com.hatch.browser.protocol.ScrollOperation;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class BrowserOperationCatalogKt {
    public static final String ABSENT = "absent";
    public static final String APPEND = "append";
    public static final String ATTRIBUTE = "attribute";
    public static final String BUTTON = "button";
    public static final String CHECKED = "checked";
    public static final int DEFAULT_PIXELS = 600;
    public static final String DELAY_MS = "delay_ms";
    public static final String DELTA = "delta";
    public static final String DIRECTION = "direction";
    public static final String DOUBLE = "double";
    public static final String EDGE = "edge";
    public static final List<BrowserArg> ELEMENT;
    public static final KeyChord ENTER = new KeyChord(new Key.Named(NamedKey.ENTER), C0881AGi.A00);
    public static final BrowserArg FAILURE_CONTEXT_ARG;
    public static final String KEYS = "keys";
    public static final long MAX_HISTORY = 10;
    public static final long MAX_PIXELS = 10000;
    public static final long MAX_WAIT_MS = 30000;
    public static final String OBSERVE_AFTER = "observe_after";
    public static final BrowserArg OBSERVE_AFTER_ARG;
    public static final BrowserArg OPTIONAL_REF;
    public static final BrowserArg OPTIONAL_SCOPE;
    public static final String PIXELS = "pixels";
    public static final String READ = "read";
    public static final String REF = "ref";
    public static final String SCOPE = "scope";
    public static final String STATE = "state";
    public static final String SUBMIT = "submit";
    public static final String TEXT = "text";
    public static final String TIMEOUT_MS = "timeout_ms";
    public static final String URL = "url";
    public static final String VALUE = "value";

    public static final BrowserOperationSpec read(String str, String str2, List<BrowserArg> list, G0U<? super BrowserArgs, ? extends Command> g0u) {
        return new BrowserOperationSpec(str, str2, list, false, g0u);
    }

    static {
        BrowserArgType browserArgType = BrowserArgType.STRING;
        BrowserArg browserArgA0w = AbstractC7607F5u.A0w(REF, browserArgType, "Element ref from the latest observation, such as @e12.", false);
        OPTIONAL_REF = browserArgA0w;
        BrowserArg browserArgA0w2 = AbstractC7607F5u.A0w("scope", browserArgType, "The scope returned with that observation.", false);
        OPTIONAL_SCOPE = browserArgA0w2;
        String str = browserArgA0w.name;
        BrowserArgType browserArgType2 = browserArgA0w.type;
        String str2 = browserArgA0w.description;
        AnonymousClass005.A0x(str, browserArgType2, str2);
        BrowserArg browserArgA0w3 = AbstractC7607F5u.A0w(str, browserArgType2, str2, true);
        String str3 = browserArgA0w2.name;
        BrowserArgType browserArgType3 = browserArgA0w2.type;
        String str4 = browserArgA0w2.description;
        AnonymousClass005.A0x(str3, browserArgType3, str4);
        ELEMENT = Arrays.asList(browserArgA0w3, AbstractC7607F5u.A0w(str3, browserArgType3, str4, true));
        FAILURE_CONTEXT_ARG = AbstractC7607F5u.A0w("failure_context", browserArgType, "Opaque failure context from the preceding SDK report.", false);
        OBSERVE_AFTER_ARG = AbstractC7607F5u.A0w(OBSERVE_AFTER, BrowserArgType.BOOLEAN, "Observe the page afterwards; default true.", false);
    }

    public static final ElementRef elementRef(BrowserArgs browserArgs) {
        String strString;
        String strString2 = browserArgs.string(REF);
        if (strString2 == null || (strString = browserArgs.string("scope")) == null) {
            return null;
        }
        return new ElementRef(strString2, new RefScope(strString));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ElementState elementState(BrowserArgs browserArgs) {
        String strString;
        String strString2 = browserArgs.string("state");
        if (strString2 != null) {
            String strA0u = AnonymousClass001.A0u(strString2);
            switch (strA0u.hashCode()) {
                case -1840852242:
                    if (strA0u.equals("unchecked")) {
                        return new ElementState.Checked(false);
                    }
                    break;
                case -1609594047:
                    if (strA0u.equals("enabled")) {
                        return ElementState.Enabled.INSTANCE;
                    }
                    break;
                case -1217487446:
                    if (strA0u.equals("hidden")) {
                        return ElementState.Hidden.INSTANCE;
                    }
                    break;
                case 111972721:
                    if (strA0u.equals(VALUE) && (strString = browserArgs.string(VALUE)) != null) {
                        return new ElementState.ValueEquals(strString);
                    }
                    break;
                case 270940796:
                    if (strA0u.equals("disabled")) {
                        return ElementState.Disabled.INSTANCE;
                    }
                    break;
                case 466743410:
                    if (strA0u.equals("visible")) {
                        return ElementState.Visible.INSTANCE;
                    }
                    break;
                case 742313895:
                    if (strA0u.equals(CHECKED)) {
                        return new ElementState.Checked(true);
                    }
                    break;
            }
        }
        return null;
    }

    public static final /* synthetic */ <T extends Enum<T>> T enumArg(String str, T t) {
        if (str == null) {
            return t;
        }
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public static final boolean hasPartialElement(BrowserArgs browserArgs) {
        return AnonymousClass002.A1Y(browserArgs.string(REF)) != AnonymousClass002.A1Y(browserArgs.string("scope"));
    }

    public static final BrowserOperationSpec mutation(String str, String str2, List<BrowserArg> list, G0U<? super BrowserArgs, ? extends Command> g0u) {
        return new BrowserOperationSpec(str, str2, Hr7.A1G(list, new BrowserArg[]{OBSERVE_AFTER_ARG, FAILURE_CONTEXT_ARG}), true, g0u);
    }

    public static /* synthetic */ BrowserOperationSpec read$default(String str, String str2, List list, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            list = C0881AGi.A00;
        }
        return read(str, str2, list, g0u);
    }

    public static final FKC boundedMs(long j) {
        Long lValueOf = Long.valueOf(j);
        long jLongValue = lValueOf.longValue();
        if (1 > jLongValue || jLongValue >= 30001) {
            return null;
        }
        return FKC.A01((int) lValueOf.longValue());
    }

    public static final InputTarget inputTarget(BrowserArgs browserArgs) {
        if (hasPartialElement(browserArgs)) {
            return null;
        }
        ElementRef elementRef = elementRef(browserArgs);
        return elementRef != null ? new InputTarget.Element(elementRef) : InputTarget.Page.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Command readCommand(BrowserArgs browserArgs) {
        String strString;
        ElementReadKind attribute;
        String strString2;
        PageReadKind pageReadKind;
        if (!hasPartialElement(browserArgs) && (strString = browserArgs.string(READ)) != null) {
            String strA0u = AnonymousClass001.A0u(strString);
            ElementRef elementRef = elementRef(browserArgs);
            if (elementRef == null) {
                if (strA0u.equals("text")) {
                    pageReadKind = PageReadKind.TEXT;
                } else if (strA0u.equals("html")) {
                    pageReadKind = PageReadKind.HTML;
                }
                return new Command.ReadPage(pageReadKind, null, null);
            }
            switch (strA0u.hashCode()) {
                case 3213227:
                    if (strA0u.equals("html")) {
                        attribute = ElementReadKind.Html.INSTANCE;
                        return new Command.ReadElement(elementRef, attribute);
                    }
                    break;
                case 3556653:
                    if (strA0u.equals("text")) {
                        attribute = ElementReadKind.Text.INSTANCE;
                        return new Command.ReadElement(elementRef, attribute);
                    }
                    break;
                case 13085340:
                    if (strA0u.equals(ATTRIBUTE) && (strString2 = browserArgs.string(ATTRIBUTE)) != null) {
                        attribute = new ElementReadKind.Attribute(strString2);
                        return new Command.ReadElement(elementRef, attribute);
                    }
                    break;
                case 111972721:
                    if (strA0u.equals(VALUE)) {
                        attribute = ElementReadKind.Value.INSTANCE;
                        return new Command.ReadElement(elementRef, attribute);
                    }
                    break;
                case 742313895:
                    if (strA0u.equals(CHECKED)) {
                        attribute = ElementReadKind.Checked.INSTANCE;
                        return new Command.ReadElement(elementRef, attribute);
                    }
                    break;
                default:
                    return null;
            }
        }
        return null;
    }

    public static final Command scrollCommand(BrowserArgs browserArgs) {
        ScrollOperation reveal;
        int i;
        if (!hasPartialElement(browserArgs)) {
            ElementRef elementRef = elementRef(browserArgs);
            String strString = browserArgs.string(EDGE);
            String strString2 = browserArgs.string("direction");
            Long lM1244long = browserArgs.m1244long(PIXELS);
            int i2 = 0;
            if (strString != null) {
                if (elementRef == null && strString2 == null && lM1244long == null) {
                    PageEdge[] pageEdgeArrValues = PageEdge.values();
                    int length = pageEdgeArrValues.length;
                    while (i2 < length) {
                        PageEdge pageEdge = pageEdgeArrValues[i2];
                        if (pageEdge.name().equalsIgnoreCase(strString)) {
                            reveal = new ScrollOperation.PageToEdge(pageEdge);
                            return new Command.Scroll(reveal);
                        }
                        i2++;
                    }
                }
            } else if (strString2 != null) {
                InputTarget element = elementRef != null ? new InputTarget.Element(elementRef) : InputTarget.Page.INSTANCE;
                ScrollDirection[] scrollDirectionArrValues = ScrollDirection.values();
                int length2 = scrollDirectionArrValues.length;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    ScrollDirection scrollDirection = scrollDirectionArrValues[i2];
                    if (scrollDirection.name().equalsIgnoreCase(strString2)) {
                        if (lM1244long != null) {
                            long jLongValue = lM1244long.longValue();
                            if (1 <= jLongValue && jLongValue < 10001) {
                                i = (int) jLongValue;
                            }
                        } else {
                            i = 600;
                        }
                        reveal = new ScrollOperation.By(element, scrollDirection, i, null);
                    } else {
                        i2++;
                    }
                }
            } else if (elementRef != null && lM1244long == null) {
                reveal = new ScrollOperation.Reveal(elementRef);
                return new Command.Scroll(reveal);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.hatch.browser.protocol.Command waitCommand(com.facebook.aura.localbrowser.core.BrowserArgs r6) {
        /*
            boolean r0 = hasPartialElement(r6)
            r4 = 0
            if (r0 != 0) goto L86
            java.lang.String r0 = "delay_ms"
            java.lang.Long r5 = r6.m1244long(r0)
            java.lang.String r0 = "text"
            java.lang.String r3 = r6.string(r0)
            com.hatch.browser.protocol.ElementRef r2 = elementRef(r6)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r3, r2}
            java.util.List r0 = X.BFI.A0F(r0)
            int r0 = r0.size()
            if (r0 != r1) goto L86
            if (r5 == 0) goto L5e
            long r0 = r5.longValue()
            X.FKC r0 = boundedMs(r0)
            if (r0 == 0) goto L86
            int r0 = r0.A00
            com.hatch.browser.protocol.WaitCondition$Delay r1 = new com.hatch.browser.protocol.WaitCondition$Delay
            r1.<init>(r0)
        L39:
            java.lang.String r0 = "timeout_ms"
            java.lang.Long r0 = r6.m1244long(r0)
            if (r0 == 0) goto L5c
            long r2 = r0.longValue()
            X.FKC r0 = boundedMs(r2)
            if (r0 == 0) goto L86
            int r0 = r0.A00
            X.FKC r0 = X.FKC.A01(r0)
        L51:
            com.hatch.browser.protocol.WaitOptions r2 = new com.hatch.browser.protocol.WaitOptions
            r2.<init>(r0, r4)
            com.hatch.browser.protocol.Command$Wait r0 = new com.hatch.browser.protocol.Command$Wait
            r0.<init>(r1, r2)
            return r0
        L5c:
            r0 = r4
            goto L51
        L5e:
            if (r3 == 0) goto L78
            java.lang.String r0 = "absent"
            java.lang.Boolean r0 = r6.m1243boolean(r0)
            boolean r0 = X.AnonymousClass002.A1b(r0, r1)
            if (r0 == 0) goto L72
            com.hatch.browser.protocol.WaitCondition$PageTextAbsent r1 = new com.hatch.browser.protocol.WaitCondition$PageTextAbsent
            r1.<init>(r3)
            goto L39
        L72:
            com.hatch.browser.protocol.WaitCondition$PageTextPresent r1 = new com.hatch.browser.protocol.WaitCondition$PageTextPresent
            r1.<init>(r3)
            goto L39
        L78:
            if (r2 == 0) goto L86
            com.hatch.browser.protocol.ElementState r0 = elementState(r6)
            if (r0 == 0) goto L86
            com.hatch.browser.protocol.WaitCondition$ElementState r1 = new com.hatch.browser.protocol.WaitCondition$ElementState
            r1.<init>(r2, r0)
            goto L39
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt.waitCommand(com.facebook.aura.localbrowser.core.BrowserArgs):com.hatch.browser.protocol.Command");
    }
}
