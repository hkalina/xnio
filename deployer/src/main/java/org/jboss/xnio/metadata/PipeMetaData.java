/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.xnio.metadata;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlType(name = "pipe")
public final class PipeMetaData {

    private NamedBeanMetaData executorBean;
    private PipeEndMetaData leftEnd;
    private PipeEndMetaData rightEnd;
    private String name;

    public NamedBeanMetaData getExecutorBean() {
        return executorBean;
    }

    @XmlElement(name = "executor-bean")
    public void setExecutorBean(final NamedBeanMetaData executorBean) {
        this.executorBean = executorBean;
    }

    public PipeEndMetaData getLeftEnd() {
        return leftEnd;
    }

    @XmlElement(name = "left-end", required = true)
    public void setLeftEnd(final PipeEndMetaData leftEnd) {
        this.leftEnd = leftEnd;
    }

    public PipeEndMetaData getRightEnd() {
        return rightEnd;
    }

    @XmlElement(name = "right-end", required = true)
    public void setRightEnd(final PipeEndMetaData rightEnd) {
        this.rightEnd = rightEnd;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name", required = true)
    public void setName(final String name) {
        this.name = name;
    }
}
