import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-murousuarioregistrado_item')
export class VistaMurousuarioregistrado_item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html``;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
