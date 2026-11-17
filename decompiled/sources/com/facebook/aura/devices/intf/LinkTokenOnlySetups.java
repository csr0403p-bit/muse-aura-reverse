package com.facebook.aura.devices.intf;

import X.A3o;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7AG;
import X.C7AH;
import X.F60;
import X.G0U;

/* loaded from: classes4.dex */
public final class LinkTokenOnlySetups {
    public static final int $stable = 0;
    public static final LinkTokenOnlySetups INSTANCE = new LinkTokenOnlySetups();

    /* renamed from: com.facebook.aura.devices.intf.LinkTokenOnlySetups$resolve$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, LinkTokenOnlySetup> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ LinkTokenOnlySetup invoke(Integer num) {
            LinkTokenOnlySetupProviderStatic.setup(AnonymousClass001.A0F(num));
            throw F60.createAndThrow();
        }

        public final LinkTokenOnlySetup invoke(int i) {
            LinkTokenOnlySetupProviderStatic.setup(i);
            throw F60.createAndThrow();
        }
    }

    public final LinkTokenOnlySetup resolve() {
        Object next;
        A3o a3o = A3o.A00;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass003.A0u(a3o, anonymousClass1);
        C7AH c7ah = new C7AH(new C7AG(anonymousClass1, a3o));
        while (true) {
            if (!c7ah.hasNext()) {
                next = null;
                break;
            }
            next = c7ah.next();
            if (((LinkTokenOnlySetup) next).isEnabled()) {
                break;
            }
        }
        return (LinkTokenOnlySetup) next;
    }
}
