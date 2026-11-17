package com.facebook.aura.commands.alarm;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class AlarmStore$remove$removed$1 extends AbstractC7559F3s implements G0U<NodeAlarm, Boolean> {
    public final /* synthetic */ String $id;

    @Override // X.G0U
    public final Boolean invoke(NodeAlarm nodeAlarm) {
        C7384Etj.A0Y(nodeAlarm, 0);
        return C60O.A0h(nodeAlarm.id, this.$id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmStore$remove$removed$1(String str) {
        super(1);
        this.$id = str;
    }
}
