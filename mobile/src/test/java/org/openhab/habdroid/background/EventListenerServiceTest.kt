/*
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.openhab.habdroid.background

import org.junit.Assert
import org.junit.Test

class EventListenerServiceTest {
    @Test
    fun checkTitle() {
        EventListenerService.KNOWN_EVENT_LISTENER_KEYS.forEach {
            Assert.assertNotEquals(EventListenerService.getTitleResForDeviceInfo(it), 0)
        }
    }
}
