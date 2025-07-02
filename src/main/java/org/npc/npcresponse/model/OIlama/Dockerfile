FROM ollama/ollama:latest

ENV OLLAMA_MODEL="llama2"

ENV NVIDIA_VISIBLE_DEVICES=all
ENV NVIDIA_DRIVER_CAPABILITIES=compute,utility

CMD ["sh", "-c", "ollama pull ${OLLAMA_MODEL} && ollama serve"]