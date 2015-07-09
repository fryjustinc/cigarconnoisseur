/**
 * @project RoboMVVM
 * @project RoboMVVM(https://github.com/debdattabasu/RoboMVVM)
 * @author Debdatta Basu
 *
 * @license 3-clause BSD license(http://opensource.org/licenses/BSD-3-Clause).
 *      Copyright (c) 2014, Debdatta Basu. All rights reserved.
 *
 *      Redistribution and use in source and binary forms, with or without modification, are permitted provided that
 *      the following conditions are met:
 *
 *          1. Redistributions of source code must retain the above copyright notice, this list of
 *             conditions and the following disclaimer.
 *
 *          2. Redistributions in binary form must reproduce the above copyright notice, this list of
 *             conditions and the following disclaimer in the documentation and/or other materials
 *             provided with the distribution.
 *
 *          3. Neither the name of the copyright holder nor the names of its contributors may be used
 *             to endorse or promote products derived from this software without specific prior
 *             written permission.
 *
 *      THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 *      INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *      IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 *      OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 *      OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *      OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *      POSSIBILITY OF SUCH DAMAGE.
 */

package com.example.fryjc.cigarconnoisseur.generics.robomvvm.componentmodel;

/**
 * Used to notify listeners when a property in a {@link org.dbasu.robomvvm.componentmodel.Component} changes.
 */
public class PropertyChangeEventArg extends EventArg {

    private final String propertyName;

    /**
     * Constructs a PropertyChangeEventArg that notifies of a property change.
     * @param sender
     *          The component whose property has changed.
     * @param propertyName
     *          The name of the property that changed.
     */
    public PropertyChangeEventArg(Component sender, String propertyName) {
        super(sender);
        this.propertyName = propertyName;
    }

    /**
     * Get the name of the changed property.
     * @return
     *          The name of the changed property.
     */
    public String getPropertyName() {
        return propertyName;
    }
}